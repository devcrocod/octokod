package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CheckRunsResponse(
    @SerialName("total_count")
    val totalCount: Int,
    @SerialName("check_runs")
    val checkRuns: List<CheckRun>
)