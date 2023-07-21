package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryTag(
    val name: String,
    @SerialName("node_id")
    val nodeId: String,
    val commit: GitReference,
    @SerialName("zipball_url")
    val zipballUrl: String,
    @SerialName("tarball_url")
    val tarballUrl: String
)