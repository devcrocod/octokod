package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowsResponse(@SerialName("total_count") val totalCount: Int, val workflows: List<Workflow>)