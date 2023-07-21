package io.github.devcrocod.octokod.client

import io.ktor.client.engine.okhttp.*

@GithubRestDsl
public actual fun Octokod(block: GitHubClientConfig<*>.() -> Unit): Octokod = Octokod(OkHttp, block)
