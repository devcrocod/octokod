package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowRunTiming(
    @SerialName("job_id") val jobId: Long,
    @SerialName("duration_ms") val durationMs: Long
)