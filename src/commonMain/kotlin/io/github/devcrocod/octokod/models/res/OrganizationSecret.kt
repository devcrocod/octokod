package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents an organization secret.
// Does not contain the secret value
@Serializable
public data class OrganizationSecret(
    override val name: String,
    @SerialName("created_at")
    override val createdAt: LocalDateTime,
    @SerialName("updated_at")
    override val updatedAt: LocalDateTime,
    val visibility: String,
    @SerialName("selected_repositories_url")
    val selectedRepositoriesUrl: String
) : Secret