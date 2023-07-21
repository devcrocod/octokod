package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PullRequestFile(
    val sha: String,
    @SerialName("file_name")
    val fileName: String,
    val status: String,
    val additions: Int,
    val deletions: Int,
    val changes: Int,
    @SerialName("blob_url")
    val blobUrl: String,
    @SerialName("raw_url")
    val rawUrl: String,
    @SerialName("contents_url")
    val contentsUrl: String,
    val patch: String,
    @SerialName("previous_file_name")
    val previousFileName: String
)