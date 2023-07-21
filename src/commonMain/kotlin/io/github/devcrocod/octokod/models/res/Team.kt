package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.TeamRepositoryPermissions
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// organization teams
@Serializable
public data class Team(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val slug: String,
    val name: String,
    val description: String,
    val privacy: TeamPrivacy,
    val permission: String,
    val teamRepositoryPermissions: TeamRepositoryPermissions,
    val membersCount: Int,
    val reposCount: Int,
    val organization: Organization,
    val parent: Team?,
    val ldapDistinguishedName: String
)

// Used to describe a team's privacy level.
@Serializable
public enum class TeamPrivacy {
    // Only visible to organization owners and members of the team.
    @SerialName("secret")
    Secret,

    // Visible to all members of the organization.
    @SerialName("closed")
    Closed
}
