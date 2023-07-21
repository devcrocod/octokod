package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.AuthorAssociation
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PullRequestReview(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("commit_id")
    val commitId: String,
    val user: User,
    val body: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("pull_request_url")
    val pullRequestUrl: String,
    val state: PullRequestReviewState,
    @SerialName("author_association")
    val authorAssociation: AuthorAssociation,
    @SerialName("submitted_at")
    val submittedAt: LocalDateTime
)

@Serializable
public enum class PullRequestReviewState {
    @SerialName("APPROVED")
    Approved,

    @SerialName("CHANGES_REQUESTED")
    ChangesRequested,

    @SerialName("COMMENTED")
    Commented,

    @SerialName("DISMISSED")
    Dismissed,

    @SerialName("PENDING")
    Pending
}
