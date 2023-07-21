package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.Committer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Commit(
    @SerialName("node_id")
    override val nodeId: String,
    override val url: String,
    override val label: String,
    override val ref: String,
    override val sha: String,
    override val user: User,
    override val repository: Repository,
    val message: String,
    val author: Committer,
    val committer: Committer,
    val tree: GitReference,
    val parents: List<GitReference>,
    @SerialName("comment_count")
    val commentCount: Int,
    val verification: Verification
) : GitRef
