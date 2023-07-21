package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Gist(
    val url: String,
    val id: String,
    @SerialName("node_id")
    val nodeId: String,
    val description: String,
    val public: Boolean,
    val owner: User,
    val files: Map<String, GistFile>,
    val comments: Int,
    @SerialName("comments_url")
    val commentsUrl: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("git_pull_url")
    val gitPullUrl: String,
    @SerialName("git_push_url")
    val gitPushUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val forks: List<GistFork>,
    val history: List<GistHistory>
)