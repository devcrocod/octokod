package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.serializer.AuthorSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable(with = AuthorSerializer::class)
public open class Author(
    public open val login: String,
    public open val id: Int,
    @SerialName("node_id")
    public open val nodeId: String,
    @SerialName("avatar_url")
    public open val avatarUrl: String,
    public open val url: String,
    @SerialName("html_url")
    public open val htmlUrl: String,
    @SerialName("followers_url")
    public open val followersUrl: String,
    @SerialName("following_url")
    public open val followingUrl: String,
    @SerialName("gists_url")
    public open val gistsUrl: String,
    public open val type: String,
    @SerialName("starred_url")
    public open val starredUrl: String,
    @SerialName("subscriptions_url")
    public open val subscriptionsUrl: String,
    @SerialName("organizations_url")
    public open val organizationsUrl: String,
    @SerialName("repos_url")
    public open val reposUrl: String,
    @SerialName("events_url")
    public open val eventsUrl: String,
    @SerialName("received_events_url")
    public open val receivedEventsUrl: String,
    @SerialName("site_admin")
    public open val siteAdmin: Boolean
)
