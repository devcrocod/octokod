package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.CheckConclusion
import io.github.devcrocod.octokod.models.CheckStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CheckSuite(
    val id: Long,
    @SerialName("head_branch")
    val headBranch: String,
    @SerialName("head_sha")
    val headSha: String,
    val status: CheckStatus,
    val conclusion: CheckConclusion?,
    val url: String,
    val before: String,
    val after: String,
    @SerialName("pull_requests")
    val pullRequests: List<PullRequest>,
    val app: GitHubApp,
    val repository: Repository
)