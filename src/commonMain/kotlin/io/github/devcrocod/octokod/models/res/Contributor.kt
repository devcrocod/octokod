package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents a contributor on GitHub.
@Serializable
public data class Contributor(
    val author: Author,
    val total: Int,
    val weeks: List<WeeklyHash>
)