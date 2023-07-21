package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
public data class AdditionsAndDeletions(
    val timestamp: LocalDateTime,
    val additions: Int,
    val deletions: Int
)
