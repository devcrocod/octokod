package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents the response information from a <see cref="UserAdministrationClient.Rename(String, UserRename)"/> operation
@Serializable
public data class UserRenameResponse(val message: String, val url: String)