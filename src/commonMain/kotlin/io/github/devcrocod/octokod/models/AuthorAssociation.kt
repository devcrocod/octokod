package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// States of a Team/Organization Membership
@Serializable
public enum class AuthorAssociation {
    // Author has been invited to collaborate on the repository.
    @SerialName("COLLABORATOR")
    Collaborator,

    // Author has previously committed to the repository.
    @SerialName("CONTRIBUTOR")
    Contributor,

    // Author has not previously committed to GitHub.
    @SerialName("FIRST_TIMER")
    FirstTimer,

    // Author has not previously committed to the repository.
    @SerialName("FIRST_TIME_CONTRIBUTOR")
    FirstTimeContributor,

    // Author is a member of the organization that owns the repository.
    @SerialName("MEMBER")
    Member,

    // Author is the owner of the repository.
    @SerialName("OWNER")
    Owner,

    // Author has no association with the repository.
    @SerialName("NONE")
    None
}