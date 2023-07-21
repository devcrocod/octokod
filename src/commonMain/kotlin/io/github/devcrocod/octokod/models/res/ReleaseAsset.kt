package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class ReleaseAsset(
    val url: String,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    val label: String,
    val state: String,
    @SerialName("content_type")
    val contentType: String,
    val size: Int,
    @SerialName("download_count")
    val downloadCount: Int,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    @SerialName("browser_download_url")
    val browserDownloadUrl: String,
    val uploader: Author
)