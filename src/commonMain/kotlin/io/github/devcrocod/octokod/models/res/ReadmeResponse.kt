package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ReadmeResponse(
    val content: String,
    val name: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val url: String,
    val encoding: String
)