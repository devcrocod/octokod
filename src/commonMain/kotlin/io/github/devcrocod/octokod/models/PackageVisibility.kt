package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class PackageVisibility {
    // Only public packages
    @SerialName("public")
    Public,

    // Only private packages
    @SerialName("private")
    Private,

    // Only supported by container package types, otherwise the same as private
    @SerialName("internal")
    Internal
}