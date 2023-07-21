package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.RateLimit
import kotlinx.serialization.Serializable


@Serializable
public data class MiscellaneousRateLimit(val resources: ResourceRateLimit, val rate: RateLimit)