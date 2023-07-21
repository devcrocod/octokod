package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// A historical version of a <see cref="Gist"/>
@Serializable
public data class GistHistory(
    val url: String,
    val version: String,
    val user: User,
    @SerialName("change_status")
    val changeStatus: GistChangeStatus,
    @SerialName("committed_at")
    val committedAt: LocalDateTime
)