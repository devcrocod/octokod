package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class TeamMembershipDetails(val role: TeamRole, val state: MembershipState)


// Roles within a Team
@Serializable
public enum class TeamRole {

    // Regular Team Member
    @SerialName("member")
    Member,

    //  Team Maintainer
    @SerialName("maintainer")
    Maintainer
}
