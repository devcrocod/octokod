package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Based on "#/components/schemas/repository-collaborator-permission:
@Serializable
public data class CollaboratorPermissionResponse(
    val permission: String,
    @SerialName("role_name")
    val roleName: String,
    val collaborator: Collaborator
)