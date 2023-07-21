package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class TagObject(
    @SerialName("node_id")
    override val nodeId: String,
    override val url: String,
    override val label: String,
    override val ref: String,
    override val sha: String,
    override val user: User,
    override val repository: Repository,
    val type: TaggedType
) : GitRef

// Represents the type of object being tagged
@Serializable
public enum class TaggedType {
    @SerialName("commit")
    Commit,

    @SerialName("blob")
    Blob,

    @SerialName("tree")
    Tree,

    @SerialName("tag")
    Tag
}
