package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.DayOfWeek
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PunchCardPoint(
    @SerialName("day_of_week")
    val dayOfWeek: DayOfWeek,
    @SerialName("hour_of_the_day")
    val hourOfTheDay: Int,
    @SerialName("commit_count")
    val commitCount: Int
)