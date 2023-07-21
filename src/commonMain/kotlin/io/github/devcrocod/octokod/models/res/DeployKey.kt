package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class DeployKey(
    val id: Int,
    val key: String,
    val url: String,
    val title: String
)