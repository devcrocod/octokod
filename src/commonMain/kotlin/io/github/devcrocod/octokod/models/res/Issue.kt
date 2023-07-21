package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.LockReason
import io.github.devcrocod.octokod.models.req.ItemState
import io.github.devcrocod.octokod.models.req.ItemStateReason
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Issue(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("comments_url")
    val commentsUrl: String,
    @SerialName("events_url")
    val eventsUrl: String,
    val number: Int,
    val state: ItemState,
    val title: String,
    val body: String,
    @SerialName("closed_by")
    val closedBy: User,
    val user: User,
    val labels: List<Label>,
    val assignee: User,
    val assignees: List<User>,
    val milestone: Milestone,
    val comments: Int,
    @SerialName("pull_request")
    val pullRequest: PullRequest,
    @SerialName("closed_at")
    val closedAt: LocalDateTime?,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime?,
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val locked: Boolean,
    val repository: Repository,
    val reactions: ReactionSummary,
    @SerialName("active_lock_reason")
    val activeLockReason: LockReason?,
    @SerialName("state_reason")
    val stateReason: ItemStateReason?
)