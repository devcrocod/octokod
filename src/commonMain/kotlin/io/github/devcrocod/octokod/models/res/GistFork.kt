package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class GistFork(
    @SerialName("node_id")
    val nodeId: String,
    val user: User,
    val url: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime
)