package io.github.devcrocod.octokod.models

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents the author or committer to a Git commit. This is the information stored in Git and should not be
// confused with GitHub account information.
@Serializable
public data class Committer(
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    val email: String,
    val date: LocalDateTime
)
