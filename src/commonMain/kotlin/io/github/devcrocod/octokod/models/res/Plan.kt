package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Plan(
    val collaborators: Long,
    val name: String,
    val space: Long,
    val privateRepos: Long,
)