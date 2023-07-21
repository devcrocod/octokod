package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents a GitHub application.
@Serializable
public data class GitHubApp(
    val id: Long,
    val slug: String,
    val name: String,
    val owner: User,
    val description: String,
    @SerialName("external_url")
    val externalUrl: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val permissions: InstallationPermissions,
    val events: List<String>
)