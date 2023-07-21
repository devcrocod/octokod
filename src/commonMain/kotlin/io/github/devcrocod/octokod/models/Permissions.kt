package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Permission.cs file houses all permission-related enums / classes
// This file was created based on this suggestion https://github.com/octokit/octokit.net/issues/2323#issuecomment-1322766701
@Serializable
public enum class InstallationReadWritePermissionLevel {
    @SerialName("read")
    Read,

    @SerialName("write")
    Write
}

@Serializable
public enum class InstallationReadWriteAdminPermissionLevel {
    @SerialName("read")
    Read,

    @SerialName("write")
    Write,

    @SerialName("admin")
    Admin
}

@Serializable
public enum class InstallationWritePermissionLevel {
    @SerialName("write")
    Write
}

@Serializable
public enum class InstallationReadPermissionLevel {
    @SerialName("read")
    Read
}

// The permission to grant the team on this repository(Legacy).
@Serializable
public enum class TeamPermissionLegacy {
    @SerialName("pull")
    Pull,

    @SerialName("push")
    Push,

    @SerialName("admin")
    Admin
}

// Deprecated. The permission that new repositories will be added to the team with when none is specified
// Default: pull
// Can be one of: pull, push
@Serializable
public enum class TeamPermission {
    /// <summary>
    /// team members can pull, but not push to these repositories
    /// </summary>
    @SerialName("pull")
    Pull,

    /// <summary>
    /// team members can pull and push to these repositories
    /// </summary>
    @SerialName("push")
    Push
}

// The permission associated with the invitation for a collaborator in a repository
@Serializable
public enum class InvitationPermissionType {
    @SerialName("read")
    Read,

    @SerialName("write")
    Write,

    @SerialName("admin")
    Admin,

    @SerialName("triage")
    Triage,

    @SerialName("maintain")
    Maintain
}

@Serializable
public enum class CollaboratorPermission {
    @SerialName("pull")
    Pull,

    @SerialName("triage")
    Triage,

    @SerialName("push")
    Push,

    @SerialName("maintain")
    Maintain,

    @SerialName("admin")
    Admin
}

// Object for team repository permissions
@Serializable
public data class TeamRepositoryPermissions(
    val pull: Boolean,
    val triage: Boolean,
    val push: Boolean,
    val maintain: Boolean,
    val admin: Boolean
)

// Object for collaborator permissions
@Serializable
public data class CollaboratorPermissions(
    val pull: Boolean,
    val triage: Boolean?,
    val push: Boolean,
    val maintain: Boolean?,
    val admin: Boolean
)
