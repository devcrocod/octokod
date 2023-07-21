package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WeeklyCommitActivity(val days: List<Int>, val total: Int, val week: Long)