package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RunnerApplication(
    val os: String,
    val architecture: String,
    @SerialName("download_url")
    val downloadUrl: String,
    val filename: String,
    @SerialName("temp_download_token")
    val tempDownloadToken: String
)