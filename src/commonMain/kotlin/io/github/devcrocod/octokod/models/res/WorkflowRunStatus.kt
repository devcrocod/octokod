package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class WorkflowRunStatus {
    @SerialName("requested")
    Requested,

    @SerialName("in_progress")
    InProgress,

    @SerialName("completed")
    Completed,

    @SerialName("queued")
    Queued,

    @SerialName("waiting")
    Waiting,

    @SerialName("pending")
    Pending

}