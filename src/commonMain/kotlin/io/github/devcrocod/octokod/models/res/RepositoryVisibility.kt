package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// The properties that repositories can be visible by.
@Serializable
public enum class RepositoryVisibility {
    // Sets repository visibility to public
    @SerialName("public")
    Public,

    // Sets repository visibility to private
    @SerialName("private")
    Private,

    // Sets repository visibility to internal
    @SerialName("internal")
    Internal,
}