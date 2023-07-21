package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class WorkflowRunConclusion {
    @SerialName("success")
    Success,

    @SerialName("failure")
    Failure,

    @SerialName("neutral")
    Neutral,

    @SerialName("cancelled")
    Cancelled,

    @SerialName("timed_out")
    TimedOut,

    @SerialName("action_required")
    ActionRequired,

    @SerialName("stale")
    Stale,

    @SerialName("startup_failure")
    StartupFailure,

    @SerialName("skipped")
    Skipped,
}
