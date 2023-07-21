package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class WorkflowState {
    @SerialName("active")
    Active,

    @SerialName("deleted")
    Deleted,

    @SerialName("disabled_fork")
    DisabledFork,

    @SerialName("disabled_inactivity")
    DisabledInactivity,

    @SerialName("disabled_manually")
    DisabledManually
}