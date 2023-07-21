package io.github.devcrocod.octokod.authentication

import io.github.devcrocod.octokod.client.Octokod
import io.github.devcrocod.octokod.client.appAuth
import io.github.devcrocod.octokod.client.auth
import io.github.devcrocod.octokod.client.tokenAuth
import io.ktor.client.engine.mock.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.utils.io.core.*
import kotlinx.coroutines.runBlocking
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi
import kotlin.test.Test
import kotlin.test.assertEquals

class AuthenticatorTests {

    @OptIn(ExperimentalEncodingApi::class)
    private val octokod = Octokod(MockEngine) {
        engine {
            addHandler { request ->
                when (request.headers[HttpHeaders.Authorization]) {
                    "Bearer test_token" -> respondOk()
                    "Basic " + Base64.encode("test_username:test_password".toByteArray()) -> respondOk()
                    else -> respondError(HttpStatusCode.Unauthorized)
                }
            }
        }
    }

    @Test
    fun `test token auth`() = runBlocking {
        octokod.config {
            auth {
                tokenAuth("test_token")
            }
        }

        val response: HttpResponse = octokod.get("https://api.github.com/user")
        assertEquals(HttpStatusCode.OK, response.status)
    }

    @Test
    fun `test app auth`() = runBlocking {
        octokod.config {
            auth {
                appAuth("test_username", "test_password")
            }
        }

        val response: HttpResponse = octokod.get("https://api.github.com/user")
        assertEquals(HttpStatusCode.OK, response.status)
    }
}
