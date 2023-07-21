package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public sealed interface RepositoryContentCommonInfo {
    public val name: String
    public val path: String
    public val sha: String
    public val size: Int
    public val type: ContentType

    @SerialName("download_url")
    public val downloadUrl: String
    public val url: String

    @SerialName("git_url")
    public val gitUrl: String

    @SerialName("html_url")
    public val htmlUrl: String
}


// Information about a file in a repository. It does not include the contents of the file.
@Serializable
public data class RepositoryContentInfo(
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