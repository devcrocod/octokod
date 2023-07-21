package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Label(
    val id: Long,
    val url: String,
    val name: String,
    @SerialName("node_id")
    val nodeId: String,
    val color: String,
    val description: String,
    val default: Boolean
)