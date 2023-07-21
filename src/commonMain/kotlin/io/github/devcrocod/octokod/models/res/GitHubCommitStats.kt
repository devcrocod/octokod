package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// An enhanced git commit containing links to additional resources
@Serializable
public data class GitHubCommitStats(val additions: Int, val deletions: Int, val total: Int)