package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RunnerGroupResponse(
    @SerialName("total_count") val totalCount: Int,
    @SerialName("runner_groups") val runnerGroups: List<RunnerGroup>
)