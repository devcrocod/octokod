package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class OrganizationMembershipRole {
    @SerialName("direct_member")
    DirectMember,

    @SerialName("admin")
    Admin,

    @SerialName("billing_manager")
    BillingManager,

    @SerialName("hiring_manager")
    HiringManager,

    @SerialName("reinstate")
    Reinstate

}