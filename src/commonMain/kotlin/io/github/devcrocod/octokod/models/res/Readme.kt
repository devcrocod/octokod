package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Readme(
    @SerialName("html_content")
    val htmlContent: String,
    val content: String,
    val name: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val url: String
)
