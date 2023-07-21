package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.AuthorAssociation
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PullRequestReviewComment(
    val url: String,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("diff_hunk")
    val diffHunk: String,
    val path: String,
    val position: Int?,
    @SerialName("original_position")
    val originalPosition: Int?,
    @SerialName("commit_id")
    val commitId: String,
    @SerialName("original_commit_id")
    val originalCommitId: String,
    val user: User,
    val body: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("pull_request_url")
    val pullRequestUrl: String,
    val reactions: ReactionSummary,
    @SerialName("in_replyTo_id")
    val inReplyToId: Int?,
    @SerialName("pull_request_review_id")
    val pullRequestReviewId: Int?,
    @SerialName("author_association")
    val authorAssociation: AuthorAssociation
)

@Serializable
public enum class PullRequestReviewCommentSort {
    // Sort by create date (default)
    @SerialName("created")
    Created,

    // Sort by the date of the last update
    @SerialName("updated")
    Updated
}
