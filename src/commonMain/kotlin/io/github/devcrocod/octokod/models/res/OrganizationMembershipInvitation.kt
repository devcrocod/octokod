package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class OrganizationMembershipInvitation(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val login: String,
    val email: String,
    val role: OrganizationMembershipRole,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val inviter: User
)