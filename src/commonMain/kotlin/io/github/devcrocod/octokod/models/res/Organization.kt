package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Organization(
    val avatarUrl: String,
    val bio: String,
    val blog: String,
    val collaborators: Int,
    val company: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val diskUsage: Int,
    val email: String,
    val followers: Int,
    val following: Int,
    val hireable: Boolean?,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("total_priva")
    val totalPriva: Int,
    @SerialName("node_id")
    val nodeId: String,
    val location: String,
    val login: String,
    val name: String,
    val ownedPrivateRepos: Int,
    val plan: Plan,
    val privateGists: Int,
    val publicGists: Int,
    val publicRepos: Int,
    val url: String,
    val billingAddress: String,
    val reposUrl: String,
    val eventsUrl: String,
    val hooksUrl: String,
    val issuesUrl: String,
    val membersUrl: String,
    val publicMembersUrl: String,
    val description: String,
    val isVerified: Boolean,
    val hasOrganizationProjects: Boolean,
    val hasRepositoryProjects: Boolean,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime
)
