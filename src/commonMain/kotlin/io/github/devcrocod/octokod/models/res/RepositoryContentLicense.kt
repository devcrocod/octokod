package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryContentLicense(
    val license: LicenseMetadata,
    override val name: String,
    override val path: String,
    override val sha: String,
    override val size: Int,
    override val type: ContentType,
    @SerialName("download_url")
    override val downloadUrl: String,
    override val url: String,
    @SerialName("git_url")
    override val gitUrl: String,
    @SerialName("html_url")
    override val htmlUrl: String
) : RepositoryContentCommonInfo