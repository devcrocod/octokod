package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.*
import io.ktor.utils.io.core.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.serialization.json.Json
import kotlin.coroutines.CoroutineContext

@DslMarker
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPEALIAS, AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
public annotation class GithubRestDsl

@GithubRestDsl
public expect fun Octokod(block: HttpClientConfig<*>.() -> Unit = {}): Octokod

@GithubRestDsl
public fun <T : HttpClientEngineConfig> Octokod(
    engineFactory: HttpClientEngineFactory<T>,
    block: HttpClientConfig<T>.() -> Unit = {}
): Octokod {
    val client = HttpClient(engineFactory) {
        block()
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }

    return Octokod(client)
}

@GithubRestDsl
public class Octokod internal constructor(
    private var client: HttpClient,
) : CoroutineScope, Closeable {

    override val coroutineContext: CoroutineContext
        get() = client.coroutineContext

    public fun config(block: HttpClientConfig<*>.() -> Unit) {
        client = client.config(block)
    }

    public suspend fun get(urlString: String): HttpResponse = this.client.get(urlString)

    override fun close() {
        client.close()
    }
}

public data class Customer(val id: Int, val firstName: String, val lastName: String)