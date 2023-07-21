package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryTrafficCloneSummary(
    val count: Int,
    val uniques: Int,
    val clones: List<RepositoryTrafficClone>
)

@Serializable
public data class RepositoryTrafficClone(val timestamp: LocalDateTime, val count: Int, val uniques: Int)

@Serializable
public enum class TrafficDayOrWeek {
    @SerialName("day")
    Day,

    @SerialName("week")
    Week
}
