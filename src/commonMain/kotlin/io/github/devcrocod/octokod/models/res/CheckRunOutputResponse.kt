package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CheckRunOutputResponse(
    val title: String,
    val summary: String,
    val text: String,
    @SerialName("annotations_count")
    val annotationsCount: Long
)
