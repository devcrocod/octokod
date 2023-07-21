package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents additional information about a star (such as creation time)
@Serializable
public data class RepositoryStar(@SerialName("starred_at") val starredAt: LocalDateTime, val repo: Repository)