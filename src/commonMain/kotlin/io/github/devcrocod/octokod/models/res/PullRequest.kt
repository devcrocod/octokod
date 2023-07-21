package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.LockReason
import io.github.devcrocod.octokod.models.req.ItemState
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PullRequest(
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
    @SerialName("closed_at")
    val closedAt: LocalDateTime?,
    @SerialName("merged_at")
    val mergedAt: LocalDateTime?,
    val head: GitReference,
    val base: GitReference,
    val user: User,
    val assignee: User,
    val assignees: List<User>,
    val draft: Boolean,
    val mergeable: Boolean?,
    @SerialName("mergeable_state")
    val mergeableState: MergeableState?,
    @SerialName("merged_by")
    val mergedBy: User,
    @SerialName("merge_commit_sha")
    val mergeCommitSha: String,
    val comments: Int,
    val commits: Int,
    val additions: Int,
    val deletions: Int,
    @SerialName("changed_files")
    val changedFiles: Int,
    val milestone: Milestone,
    val locked: Boolean,
    @SerialName("maintainer_canModify")
    val maintainerCanModify: Boolean?,
    @SerialName("requested_reviewers")
    val requestedReviewers: List<User>,
    @SerialName("requested_teams")
    val requestedTeams: List<Team>,
    val labels: List<Label>,
    @SerialName("active_lock_reason")
    val activeLockReason: LockReason?
)

// Provides extra information regarding the mergeability of a pull request
@Serializable
public enum class MergeableState {

    // Merge conflict. Merging is blocked.
    @SerialName("dirty")
    Dirty,


    // Mergeability was not checked yet. Merging is blocked.
    @SerialName("unknown")
    Unknown,


    // Failing/missing required status check.  Merging is blocked.
    @SerialName("blocked")
    Blocked,


    // Head branch is behind the base branch. Only if required status checks is enabled but loose policy is not. Merging is blocked.
    @SerialName("behind")
    Behind,


    // Failing/pending commit status that is not part of the required status checks. Merging is still allowed.
    @SerialName("unstable")
    Unstable,


    // GitHub Enterprise only, if a repo has custom pre-receive hooks. Merging is allowed.
    @SerialName("has_hooks")
    HasHooks,


    // No conflicts, everything good. Merging is allowed.
    @SerialName("clean")
    Clean,


    // Not ready for review. Merging is blocked.
    @SerialName("draft")
    Draft
}
