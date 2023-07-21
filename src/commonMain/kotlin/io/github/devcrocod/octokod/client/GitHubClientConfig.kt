package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.auth.*

@GithubRestDsl
public class GitHubClientConfig<T : HttpClientEngineConfig> {
    internal var ktorConfig: HttpClientConfig<T> = HttpClientConfig()

    public fun auth(block: Auth.() -> Unit) {
        ktorConfig.Auth(block)
    }
}