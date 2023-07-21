package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowRunBillableTiming(
    @SerialName("total_ms")
    val totalMs: Long,
    val jobs: Long,
    @SerialName("job_runs")
    val jobRuns: List<WorkflowRunTiming>
)
