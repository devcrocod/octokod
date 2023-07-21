package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public sealed interface Secret {
    public val name: String

    @SerialName("created_at")
    public val createdAt: LocalDateTime

    @SerialName("updated_at")
    public val updatedAt: LocalDateTime?
}

// Represents a repository secret.
// Does not contain the secret value
@Serializable
public data class RepositorySecret(
    override val name: String,
    @SerialName("created_at")
    override val createdAt: LocalDateTime,
    @SerialName("updated_at")
    override val updatedAt: LocalDateTime?
) : Secret