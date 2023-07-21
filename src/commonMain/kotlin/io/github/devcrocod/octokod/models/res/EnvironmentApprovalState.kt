package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class EnvironmentApprovalState {
    @SerialName("approved")
    Approved,

    @SerialName("rejected")
    Rejected,
}