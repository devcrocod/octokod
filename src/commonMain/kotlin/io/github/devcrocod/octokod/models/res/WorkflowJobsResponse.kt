package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowJobsResponse(@SerialName("total_count") val totalCount: Int, val jobs: List<WorkflowJob>)