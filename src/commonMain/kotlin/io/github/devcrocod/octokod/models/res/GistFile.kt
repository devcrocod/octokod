package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class GistFile(
    val size: Int,
    val filename: String,
    val type: String,
    val language: String,
    val content: String,
    @SerialName("raw_url")
    val rawUrl: String
)