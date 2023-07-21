package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Lists all the feeds available to the authenticating user:
@Serializable
public data class Feed(
    @SerialName("timeline_url")
    val timelineUrl: String,
    @SerialName("user_url")
    val userUrl: String,
    @SerialName("current_user_public_url")
    val currentUserPublicUrl: String,
    @SerialName("current_user_url")
    val currentUserUrl: String,
    @SerialName("current_user_actor_url")
    val currentUserActorUrl: String,
    @SerialName("current_user_organization_url")
    val currentUserOrganizationUrl: String,
    val links: FeedLinks
)