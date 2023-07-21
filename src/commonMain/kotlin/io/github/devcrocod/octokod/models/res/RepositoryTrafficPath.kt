package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryTrafficPath(val path: String, val title: String, val count: Int, val uniques: Int)