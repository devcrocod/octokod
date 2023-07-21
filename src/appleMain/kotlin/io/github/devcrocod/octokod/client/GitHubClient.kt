package io.github.devcrocod.octokod.client

import io.ktor.client.engine.darwin.*

@GithubRestDsl
public actual fun Octokod(block: GitHubClientConfig<*>.() -> Unit): Octokod = Octokod(Darwin, block)
