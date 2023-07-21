package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class RunnerLabel(val id: Long, val name: String, val type: String)