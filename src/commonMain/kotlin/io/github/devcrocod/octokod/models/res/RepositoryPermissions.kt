package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable

@Serializable
public data class RepositoryPermissions(
    val admin: Boolean,
    val maintain: Boolean,
    val push: Boolean,
    val triage: Boolean,
    val pull: Boolean
)