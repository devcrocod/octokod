package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Notification(
    val id: String,
    val repository: Repository,
    val subject: NotificationInfo,
    val reason: String,
    val unread: Boolean,
    @SerialName("updated_at")
    val updatedAt: String,
    @SerialName("last_read_at")
    val lastReadAt: String,
    val url: String
)