package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class CheckStatus {
    @SerialName("queued")
    Queued,

    @SerialName("in_progress")
    InProgress,

    @SerialName("completed")
    Completed,
}

@Serializable
public enum class CheckConclusion {
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

    @SerialName("skipped")
    Skipped,

    @SerialName("stale")
    Stale,
}

@Serializable
public enum class CheckAnnotationLevel {
    @SerialName("notice")
    Notice,

    @SerialName("warning")
    Warning,

    @SerialName("failure")
    Failure,
}

@Serializable
public enum class CheckWarningLevel {
    @SerialName("notice")
    Notice,

    @SerialName("warning")
    Warning,

    @SerialName("failure")
    Failure,
}