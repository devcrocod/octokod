package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class ProjectCard(
    @SerialName("column_url")
    val columnUrl: String,
    @SerialName("content_url")
    val contentUrl: String,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val note: String,
    val creator: User,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val archived: Boolean
)