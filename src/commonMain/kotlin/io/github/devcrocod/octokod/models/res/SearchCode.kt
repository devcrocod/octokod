package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class SearchCode(
    val name: String,
    val path: String,
    val sha: String,
    val url: String,
    @SerialName("git_url")
    val gitUrl: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val repository: Repository
)