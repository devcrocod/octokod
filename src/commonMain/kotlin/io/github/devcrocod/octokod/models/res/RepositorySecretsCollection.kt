package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents response of secrets for a repository.
@Serializable
public data class RepositorySecretsCollection(
    @SerialName("total_count") val totalCount: Int,
    val secrets: List<RepositorySecret>
)