package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryTrafficReferrer(val referrer: String, val count: Int, val uniques: Int)