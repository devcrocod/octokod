package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// An enhanced git commit containing links to additional resources
@Serializable
public data class GitHubCommit(
    @SerialName("node_id")
    override val nodeId: String,
    override val url: String,
    override val label: String,
    override val ref: String,
    override val sha: String,
    override val user: User,
    override val repository: Repository,
    val author: Author,
    @SerialName("comments_url")
    val commentsUrl: String,
    val commit: Commit,
    val committer: Author,
    @SerialName("html_url")
    val htmlUrl: String,
    val stats: GitHubCommitStats,
    val parents: List<GitReference>,
    val files: List<GitHubCommitFile>
) : GitRef