package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// States of a Team/Organization Membership
@Serializable
public enum class MembershipState {
    // The membership is pending
    @SerialName("pending")
    Pending,

    // The membership is active
    @SerialName("active")
    Active
}
