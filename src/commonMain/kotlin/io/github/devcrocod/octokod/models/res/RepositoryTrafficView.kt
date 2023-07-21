package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryTrafficViewSummary(val count: Int, val uniques: Int, val views: List<RepositoryTrafficView>)


@Serializable
public data class RepositoryTrafficView(val timestamp: LocalDateTime, val count: Int, val uniques: Int)