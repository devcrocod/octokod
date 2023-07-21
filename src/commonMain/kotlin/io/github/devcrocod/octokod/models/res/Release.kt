package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Release(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("assets_url")
    val assetsUrl: String,
    @SerialName("upload_url")
    val uploadUrl: String,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("tag_name")
    val tagName: String,
    @SerialName("target_commitish")
    val targetCommitish: String,
    val name: String,
    val body: String,
    val draft: Boolean,
    val prerelease: Boolean,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("published_at")
    val publishedAt: LocalDateTime?,
    val author: Author,
    @SerialName("tarball_url")
    val tarballUrl: String,
    @SerialName("zipball_url")
    val zipballUrl: String,
    val assets: List<ReleaseAsset>
)