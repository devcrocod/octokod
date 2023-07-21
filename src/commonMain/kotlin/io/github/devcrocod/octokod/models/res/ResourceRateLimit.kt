package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.RateLimit
import kotlinx.serialization.Serializable


@Serializable
public data class ResourceRateLimit(val core: RateLimit, val search: RateLimit)