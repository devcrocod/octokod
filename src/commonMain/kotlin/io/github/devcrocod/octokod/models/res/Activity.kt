package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Activity(
    val type: String,
    val public: Boolean,
    val repo: Repository,
    val actor: User,
    val org: Organization,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val id: String,
    val payload: ActivityPayload
)
