package io.github.devcrocod.octokod.client

import io.ktor.client.*
import io.ktor.client.engine.darwin.*

@GithubRestDsl
public actual fun Octokod(block: HttpClientConfig<*>.() -> Unit): Octokod = Octokod(Darwin, block)
