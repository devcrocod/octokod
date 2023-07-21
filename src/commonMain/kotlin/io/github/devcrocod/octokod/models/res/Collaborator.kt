package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.CollaboratorPermissions
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Collaborator(
    val login: String,
    val id: Int,
    val email: String,
    val name: String,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("avatar_url")
    val avatarUrl: String,
    @SerialName("gravatar_url")
    val gravatarUrl: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("followers_url")
    val followersUrl: String,
    @SerialName("following_url")
    val followingUrl: String,
    @SerialName("gists_url")
    val gistsUrl: String,
    val type: String,
    @SerialName("starred_url")
    val starredUrl: String,
    @SerialName("subscriptions_url")
    val subscriptionsUrl: String,
    @SerialName("organizations_url")
    val organizationsUrl: String,
    @SerialName("repos_url")
    val reposUrl: String,
    @SerialName("events_url")
    val eventsUrl: String,
    @SerialName("received_events_url")
    val receivedEventsUrl: String,
    @SerialName("site_admin")
    val siteAdmin: Boolean,
    val permissions: CollaboratorPermissions,
    @SerialName("role_name")
    val roleName: String
)