package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*

@GithubRestDsl
public actual fun Octokod(block: HttpClientConfig<*>.() -> Unit): Octokod = Octokod(OkHttp, block)
