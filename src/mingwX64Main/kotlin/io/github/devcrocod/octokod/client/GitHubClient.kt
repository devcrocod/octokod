package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.winhttp.*

public val client: HttpClient = HttpClient(WinHttp)

@GithubRestDsl
public actual fun Octokod(block: HttpClientConfig<*>.() -> Unit): Octokod = Octokod(WinHttp, block)