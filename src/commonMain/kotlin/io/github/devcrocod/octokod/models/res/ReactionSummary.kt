package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class ReactionSummary(
    val totalCount: Int,
    val plus1: Int,
    val minus1: Int,
    val laugh: Int,
    val confused: Int,
    val heart: Int,
    val hooray: Int,
    val url: String
)