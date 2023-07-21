package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class WorkflowJobStatus {
    @SerialName("queued")
    Queued,

    @SerialName("in_progress")
    InProgress,

    @SerialName("completed")
    Completed,
}
