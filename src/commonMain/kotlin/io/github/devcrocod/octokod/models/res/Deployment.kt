package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Deployment(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val sha: String,
    val ref: String,
    val url: String,
    val creator: User,
    val payload: Map<String, String>,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val description: String,
    @SerialName("statuses_url")
    val statusesUrl: String,
    @SerialName("repository_url")
    val repositoryUrl: String,
    val environment: String,
    @SerialName("original_environment")
    val originalEnvironment: String,
    @SerialName("transient_environment")
    val transientEnvironment: Boolean,
    @SerialName("production_environment")
    val productionEnvironment: Boolean,
    val task: String
)