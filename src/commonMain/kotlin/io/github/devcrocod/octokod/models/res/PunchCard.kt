package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PunchCard(@SerialName("punch_card_data") val punchCardData: List<List<Int>>)