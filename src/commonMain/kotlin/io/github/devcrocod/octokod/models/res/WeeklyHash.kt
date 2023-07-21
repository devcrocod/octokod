package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WeeklyHash(val w: Long, val a: Int, val d: Int, val c: Int)