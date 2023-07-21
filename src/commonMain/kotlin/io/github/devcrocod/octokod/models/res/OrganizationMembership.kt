package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.MembershipRole
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class OrganizationMembership(
    val url: String,
    val state: MembershipState,
    val role: MembershipRole,
    @SerialName("organization_url")
    val organizationUrl: String,
    val organization: Organization,
    val user: User
)

