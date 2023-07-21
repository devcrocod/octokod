package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class AccessToken(
    val token: String,
    @SerialName("expires_at")
    val expiresAt: LocalDateTime
)
