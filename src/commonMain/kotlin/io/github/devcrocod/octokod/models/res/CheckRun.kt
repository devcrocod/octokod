package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.CheckConclusion
import io.github.devcrocod.octokod.models.CheckStatus
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class CheckRun(
    val id: Long,
    @SerialName("head_sha")
    val headSha: String,
    @SerialName("external_id")
    val externalId: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val detailsUrl: String,
    val status: CheckStatus,
    val conclusion: CheckConclusion?,
    @SerialName("started_at")
    val startedAt: LocalDateTime,
    @SerialName("completed_at")
    val completedAt: LocalDateTime?,
    val output: CheckRunOutputResponse,
    val name: String,
    @SerialName("check_suite")
    val checkSuite: CheckSuite,
    val app: GitHubApp,
    @SerialName("pull_requests")
    val pullRequests: List<PullRequest>,
)