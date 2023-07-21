package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Duration


// Metadata of a GitHub Pages build.
@Serializable
public data class PagesBuild(
    val url: String,
    val status: PagesBuildStatus,
    val error: ApiError,
    val pusher: User,
    val commit: Commit,
    val duration: Duration,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime
)