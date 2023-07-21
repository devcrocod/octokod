package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class NotificationInfo(
    val title: String,
    val url: String,
    @SerialName("latest_comment_url")
    val latestCommentUrl: String,
    val type: String
)