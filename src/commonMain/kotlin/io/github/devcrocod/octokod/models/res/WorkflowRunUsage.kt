package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowRunUsage(
    val billable: WorkflowRunBillable,
    @SerialName("run_duration_ms") val runDurationMs: Long
)