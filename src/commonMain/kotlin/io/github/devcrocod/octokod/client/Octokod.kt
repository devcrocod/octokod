package io.github.devcrocod.octokod.client

import io.github.devcrocod.octokod.models.res.User
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlin.coroutines.CoroutineContext

@DslMarker
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPEALIAS, AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
public annotation class GithubRestDsl

@GithubRestDsl
public expect fun Octokod(block: GitHubClientConfig<*>.() -> Unit = {}): Octokod

@GithubRestDsl
public fun <T : HttpClientEngineConfig> Octokod(
    engineFactory: HttpClientEngineFactory<T>,
    block: GitHubClientConfig<T>.() -> Unit = {}
): Octokod {
    val config = GitHubClientConfig<T>().apply(block)
    val client = HttpClient(engineFactory) {
        this += config.ktorConfig
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }

    return Octokod(client, config)
}

@GithubRestDsl
public class Octokod internal constructor(
    private val client: HttpClient,
    private val clientConfig: GitHubClientConfig<out HttpClientEngineConfig> = GitHubClientConfig(),
) : CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = client.coroutineContext

    // Get the current authenticated user
    public val user: User
        get() = runBlocking { client.get("https://api.github.com/user").body() }

    // Get a specific repository by owner and name
//    public val repository(owner: String, name: String): Repository

    // Create an issue in a repository
//    fun createIssue(owner: String, name: String, issue: Issue): Issue

    // ... other methods for different GitHub API operations

    public suspend fun get(urlString: String): HttpResponse = this.client.get(urlString)
}

public data class Customer(val id: Int, val firstName: String, val lastName: String)