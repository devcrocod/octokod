package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.serializer.GitReferenceSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = GitReferenceSerializer::class)
public sealed interface GitRef {
    @SerialName("node_id")
    public val nodeId: String
    public val url: String
    public val label: String
    public val ref: String
    public val sha: String
    public val user: User
    public val repository: Repository
}

@Serializable
public data class GitReference(
    @SerialName("node_id")
    public override val nodeId: String,
    public override val url: String,
    public override val label: String,
    public override val ref: String,
    public override val sha: String,
    public override val user: User,
    public override val repository: Repository
) : GitRef