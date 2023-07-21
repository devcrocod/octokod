package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// The affected files in a <see cref="GitHubCommit"/>.
@Serializable
public data class GitHubCommitFile(
    val filename: String,
    val additions: Int,
    val deletions: Int,
    val changes: Int,
    val status: String,
    @SerialName("blob_url")
    val blobUrl: String,
    @SerialName("contents_url")
    val contentsUrl: String,
    @SerialName("raw_url")
    val rawUrl: String,
    val sha: String,
    val patch: String,
    @SerialName("previous_file_name")
    val previousFileName: String
)