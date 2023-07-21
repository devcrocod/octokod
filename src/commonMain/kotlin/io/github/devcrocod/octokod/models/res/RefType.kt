package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents the type of object created or deleted
@Serializable
public enum class RefType {
    // The object is of type repository
    @SerialName("repository")
    Repository,

    // The object is of type branch
    @SerialName("branch")
    Branch,

    // The object is of type tag
    @SerialName("tag")
    Tag
}
