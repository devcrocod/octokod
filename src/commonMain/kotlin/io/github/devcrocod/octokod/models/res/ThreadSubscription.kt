package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class ThreadSubscription(
    val subscribed: Boolean,
    val ignored: Boolean,
    val reason: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val url: String,
    @SerialName("thread_url")
    val threadUrl: String
)