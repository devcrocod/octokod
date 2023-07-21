package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.AuthorAssociation
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class IssueComment(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val body: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime?,
    val user: User,
    val reactions: ReactionSummary,
    @SerialName("author_association")
    val authorAssociation: AuthorAssociation
)

@Serializable
public enum class IssueCommentSort {
    // Sort by create date (default)
    @SerialName("created")
    Created,

    // Sort by the date of the last update
    @SerialName("updated")
    Updated
}
