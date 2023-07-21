package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.InvitationPermissionType
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Repository invitations let you manage who you collaborate with.
@Serializable
public data class RepositoryInvitation(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val repository: Repository,
    val invitee: User,
    val inviter: User,
    val permissions: InvitationPermissionType,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val expired: Boolean,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String
)