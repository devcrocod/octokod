package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CommitStatus(
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val state: CommitState,
    @SerialName("target_url")
    val targetUrl: String,
    val description: String,
    val context: String,
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    val creator: User
)

// Represents the state of a commit.
@Serializable
public enum class CommitState {

    // The commit state is still being determined. A build server might set this when it starts a build.
    @SerialName("pending")
    Pending,

    // The build was successful for the commit.
    @SerialName("success")
    Success,

    // There was some error with the build.
    @SerialName("error")
    Error,

    // The build completed and reports a failure.
    @SerialName("failure")
    Failure
}