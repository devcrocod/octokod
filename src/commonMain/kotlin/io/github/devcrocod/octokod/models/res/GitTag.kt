package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.Committer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class GitTag(
    @SerialName("node_id")
    override val nodeId: String,
    override val url: String,
    override val label: String,
    override val ref: String,
    override val sha: String,
    override val user: User,
    override val repository: Repository,
    val tag: String,
    val message: String,
    val tagger: Committer,
    val `object`: TagObject,
    val verification: Verification
) : GitRef