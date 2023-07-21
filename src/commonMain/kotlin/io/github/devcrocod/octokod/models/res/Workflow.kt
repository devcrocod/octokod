package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Workflow(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    val path: String,
    val state: WorkflowState,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("badge_url")
    val badgeUrl: String,
    @SerialName("deleted_at")
    val deletedAt: LocalDateTime?
)
