package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class Runner(
    val id: Long,
    val name: String,
    val os: String,
    val status: String,
    val busy: Boolean,
    val labels: List<RunnerLabel>
)