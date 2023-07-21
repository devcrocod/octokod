package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Reference(
    val ref: String,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    val `object`: TagObject
)