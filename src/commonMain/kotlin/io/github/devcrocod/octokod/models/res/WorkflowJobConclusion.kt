package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class WorkflowJobConclusion {
    @SerialName("success")
    Success,

    @SerialName("failure")
    Failure,

    @SerialName("neutral")
    Neutral,

    @SerialName("cancelled")
    Cancelled,

    @SerialName("skipped")
    Skipped,

    @SerialName("timed_out")
    TimedOut,

    @SerialName("action_required")
    ActionRequired,

}