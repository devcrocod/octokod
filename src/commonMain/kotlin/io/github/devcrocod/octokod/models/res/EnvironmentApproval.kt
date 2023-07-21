package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents an environment for a deployment approval.
@Serializable
public data class EnvironmentApproval(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    val url: String,
    val htmlUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime
)