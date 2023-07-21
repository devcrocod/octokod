package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CheckSuitesResponse(
    @SerialName("total_count")
    val totalCount: Int,
    @SerialName("cheack_suites")
    val checkSuites: List<CheckSuite>
)