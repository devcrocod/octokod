package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.LockReason
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class IssueEvent(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    val actor: User,
    val assignee: User,
    val label: Label,
    val event: EventInfoState,
    @SerialName("commit_id")
    val commitId: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val issue: Issue,
    @SerialName("commit_url")
    val commitUrl: String,
    val rename: RenameInfo,
    @SerialName("project_card")
    val projectCard: IssueEventProjectCard,
    @SerialName("review_requester")
    val reviewRequester: User,
    @SerialName("requested_reviewer")
    val requestedReviewer: User,
    val assigner: User,
    val lockReason: LockReason,
    @SerialName("dismissed_Review")
    val dismissedReview: DismissedReviewInfo,
    val milestone: Milestone
)