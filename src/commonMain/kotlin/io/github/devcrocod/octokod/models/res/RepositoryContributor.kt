package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.serializer.RepositoryContributorSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents a users contributions on a GitHub repository.
@Serializable(with = RepositoryContributorSerializer::class)
public data class RepositoryContributor(
    override val login: String,
    override val id: Int,
    @SerialName("node_id")
    override val nodeId: String,
    @SerialName("avatar_url")
    override val avatarUrl: String,
    override val url: String,
    @SerialName("html_url")
    override val htmlUrl: String,
    @SerialName("followers_url")
    override val followersUrl: String,
    @SerialName("following_url")
    override val followingUrl: String,
    @SerialName("gists_url")
    override val gistsUrl: String,
    override val type: String,
    @SerialName("starred_url")
    override val starredUrl: String,
    @SerialName("subscriptions_url")
    override val subscriptionsUrl: String,
    @SerialName("organizations_url")
    override val organizationsUrl: String,
    @SerialName("repos_url")
    override val reposUrl: String,
    @SerialName("events_url")
    override val eventsUrl: String,
    @SerialName("received_events_url")
    override val receivedEventsUrl: String,
    @SerialName("site_admin")
    override val siteAdmin: Boolean,
    val contributions: Int
) : Author(
    login,
    id,
    nodeId,
    avatarUrl,
    url,
    htmlUrl,
    followersUrl,
    followingUrl,
    gistsUrl,
    type,
    starredUrl,
    subscriptionsUrl,
    organizationsUrl,
    reposUrl,
    eventsUrl,
    receivedEventsUrl,
    siteAdmin
)