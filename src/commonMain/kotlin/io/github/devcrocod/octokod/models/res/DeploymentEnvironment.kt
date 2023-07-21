package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class DeploymentEnvironment(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime
)