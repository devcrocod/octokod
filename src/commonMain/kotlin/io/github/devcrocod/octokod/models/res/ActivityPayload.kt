package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable

@Serializable
public data class ActivityPayload(
    val repository: Repository,
    val sender: User,
    val installation: InstallationId
)
