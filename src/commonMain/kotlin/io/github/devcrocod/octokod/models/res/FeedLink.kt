package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Collection of feeds including both url and type
@Serializable
public data class FeedLinks(
    val timeline: FeedLink,
    val user: FeedLink,
    @SerialName("current_user_public")
    val currentUserPublic: FeedLink,
    @SerialName("current_user")
    val currentUser: FeedLink,
    @SerialName("current_user_actor")
    val currentUserActor: FeedLink,
    @SerialName("current_user_organization")
    val currentUserOrganization: FeedLink
)


// Feed information including feed url and feed type
@Serializable
public data class FeedLink(val href: String, val type: String)