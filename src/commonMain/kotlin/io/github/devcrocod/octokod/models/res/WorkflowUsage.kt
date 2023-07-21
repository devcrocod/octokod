package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowUsage(val billable: WorkflowBillable)