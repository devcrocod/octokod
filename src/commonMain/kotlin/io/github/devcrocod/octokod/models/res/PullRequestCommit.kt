package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PullRequestCommit(
    @SerialName("node_id")
    val nodeId: String,
    val author: User,
    @SerialName("comments_url")
    val commentsUrl: String,
    val commit: Commit,
    val committer: User,
    @SerialName("html_url")
    val htmlUrl: String,
    val parents: List<GitReference>,
    val sha: String,
    val url: String
)