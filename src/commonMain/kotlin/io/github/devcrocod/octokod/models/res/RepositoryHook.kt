package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryHook(
    val id: Int,
    val url: String,
    @SerialName("test_url")
    val testUrl: String,
    @SerialName("ping_url")
    val pingUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val name: String,
    val events: List<String>,
    val active: Boolean,
    val config: Map<String, String>
)