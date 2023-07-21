package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowRunBillable(
    val ubuntu: WorkflowRunBillableTiming,
    val macOS: WorkflowRunBillableTiming,
    val windows: WorkflowRunBillableTiming
)