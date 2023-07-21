package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents a piece of content in the repository. This could be a submodule, a symlink, a directory, or a file.
// Look at the Type property to figure out which one it is.
@Serializable
public data class RepositoryContent(
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
    override val htmlUrl: String,
    val encoding: String,
    @SerialName("encoded_content")
    val encodedContent: String,
    val target: String,
    @SerialName("submodule_git_url")
    val submoduleGitUrl: String
) : RepositoryContentCommonInfo