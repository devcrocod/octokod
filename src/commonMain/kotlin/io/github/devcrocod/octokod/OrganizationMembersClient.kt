package io.github.devcrocod.octokod

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Filter members in the list
// see https://developer.github.com/v3/orgs/members/#members-list for details
@Serializable
public enum class OrganizationMembersFilter {
    //  All members the authenticated user can see.
    @SerialName("all")
    All,

    // Members without two-factor authentication enabled
    @SerialName("2fa_disabled")
    TwoFactorAuthenticationDisabled
}

@Serializable
public enum class OrganizationMembersRole {
    @SerialName("all")
    All,

    @SerialName("admin")
    Admin,

    @SerialName("member")
    Member
}

@Serializable
public enum class MembershipRole {
    @SerialName("admin")
    Admin,

    @SerialName("member")
    Member
}

// A client for GitHub's Organization Members API.
// See the <a href="http://developer.github.com/v3/orgs/members/">Orgs API documentation</a> for more information.
public class OrganizationMembersClient