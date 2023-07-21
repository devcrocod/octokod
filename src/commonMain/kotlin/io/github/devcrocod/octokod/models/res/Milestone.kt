package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.req.ItemState
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Milestone(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val id: Long,
    val number: Int,
    @SerialName("node_id")
    val nodeId: String,
    val state: ItemState,
    val title: String,
    val description: String,
    val creator: User,
    @SerialName("openIssues")
    val openIssues: Int,
    @SerialName("closed_issues")
    val closedIssues: Int,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("due_on")
    val dueOn: LocalDateTime?,
    @SerialName("closed_at")
    val closedAt: LocalDateTime?,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime?
)