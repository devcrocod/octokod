package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.req.ItemState
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CommitPullRequest(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("diff_url")
    val diffUrl: String,
    @SerialName("patch_url")
    val patchUrl: String,
    @SerialName("issue_url")
    val issueUrl: String,
    @SerialName("statuses_url")
    val statusesUrl: String,
    val number: Int,
    val state: ItemState,
    val title: String,
    val body: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val closedAt: LocalDateTime?,
    val mergedAt: LocalDateTime?,
    val head: GitReference,
    val base: GitReference,
    val user: User,
    val assignee: User,
    val assignees: List<User>,
    val draft: Boolean,
    val mergeable: Boolean?,
    val mergeableState: MergeableState?,
    val mergedBy: User,
    val mergeCommitSha: String,
    val milestone: Milestone,
    val requestedReviewers: List<User>,
    val requestedTeams: List<Team>,
    val labels: List<Label>
)