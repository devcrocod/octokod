package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*

@GithubRestDsl
public fun <T : HttpClientEngineConfig> HttpClientConfig<T>.auth(block: Auth.() -> Unit) {
    this.Auth(block)
}

@GithubRestDsl
public fun Auth.tokenAuth(token: String) {
    bearer {
        loadTokens { BearerTokens(token, "") }
    }
}

@GithubRestDsl
public fun Auth.appAuth(username: String, password: String) {
    basic {
        credentials {
            BasicAuthCredentials(username, password)
        }
    }
}