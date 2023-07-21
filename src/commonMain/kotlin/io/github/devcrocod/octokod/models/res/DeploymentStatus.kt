package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class DeploymentStatus(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    val state: DeploymentState,
    val creator: User,
    val payload: Map<String, String>,
    @SerialName("target_url")
    val targetUrl: String,
    @SerialName("log_url")
    val logUrl: String,
    @SerialName("environment_url")
    val environmentUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val description: String
)

@Serializable
public enum class DeploymentState {
    @SerialName("pending")
    Pending,

    @SerialName("success")
    Success,

    @SerialName("error")
    Error,

    @SerialName("failure")
    Failure,

    @SerialName("inactive")
    Inactive,

    @SerialName("in_progress")
    InProgress,

    @SerialName("queued")
    Queued
}
