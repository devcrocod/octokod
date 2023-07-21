package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// A users email
@Serializable
public data class EmailAddress(
    val email: String,
    val verified: Boolean,
    val primary: Boolean,
    val visibility: EmailVisibility
)

// Represents the visibility of an email address.
@Serializable
public enum class EmailVisibility {

    //Primary email address and is public
    @SerialName("public")
    Public,

    // Primary email address and is private
    @SerialName("private")
    Private
}
