package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Merge(
    override val nodeId: String,
    override val url: String,
    override val label: String,
    override val ref: String,
    override val sha: String,
    override val user: User,
    override val repository: Repository,
    val author: Author,
    val committer: Author,
    val commit: Commit,
    val parents: List<GitReference>,
    @SerialName("comments_url")
    val commentsUrl: String,
    @SerialName("comments_count")
    val commentCount: Int,
    @SerialName("html_url")
    val htmlUrl: String
) : GitRef