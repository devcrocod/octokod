package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CommitComment(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val body: String,
    val path: String,
    val position: Int,
    val line: Int?,
    @SerialName("commit_id")
    val commitId: String,
    val user: User,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime?,
    val reactions: ReactionSummary
)