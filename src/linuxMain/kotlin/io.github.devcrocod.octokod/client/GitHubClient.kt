package io.github.devcrocod.octokod.client

import io.ktor.client.engine.cio.*

@GithubRestDsl
public actual fun Octokod(block: GitHubClientConfig<*>.() -> Unit): Octokod = Octokod(CIO, block)