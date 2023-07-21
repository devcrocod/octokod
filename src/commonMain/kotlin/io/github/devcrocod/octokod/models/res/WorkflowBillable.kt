package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowBillable(
    val ubuntu: WorkflowBillableTiming,
    val macOS: WorkflowBillableTiming,
    val windows: WorkflowBillableTiming
)