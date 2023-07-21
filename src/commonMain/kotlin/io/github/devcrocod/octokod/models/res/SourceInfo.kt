package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class SourceInfo(
    val actor: User,
    val id: Int,
    val issue: Issue,
    val url: String
)