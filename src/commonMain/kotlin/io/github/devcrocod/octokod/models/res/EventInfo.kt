package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class EventInfo(
    val id: Long,
    val nodeId: String,
    val url: String,
    val actor: User,
    val assignee: User,
    val label: Label,
    val event: EventInfoState,
    @SerialName("commit_id")
    val commitId: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime
)

@Serializable
public enum class EventInfoState {
    // The issue was added to a project board.
    @SerialName("added_to_project")
    AddedToProject,

    // The issue was assigned to the actor.
    @SerialName("assigned")
    Assigned,

    // GitHub unsuccessfully attempted to automatically change the base branch of the pull request.
    @SerialName("automatic_base_change_failed")
    AutomaticBaseChangeFailed,

    // GitHub successfully attempted to automatically change the base branch of the pull request.
    @SerialName("automatic_base_change_succeeded")
    AutomaticBaseChangeSucceeded,

    // The base reference branch of the pull request changed.
    @SerialName("base_ref_changed")
    BaseRefChanged,

    // The issue was closed by the actor. When the commit_id is present, it identifies the commit that
    // closed the issue using “closes / fixes #NN” syntax.
    @SerialName("closed")
    Closed,

    // A comment was added to the issue.
    @SerialName("commented")
    Commented,

    // A commit was added to the pull request's HEAD branch.
    // Only provided for pull requests.
    @SerialName("committed")
    Committed,

    // An issue was connected.
    @SerialName("connected")
    Connected,

    // The pull request was converted to draft mode.
    @SerialName("convert_to_draft")
    ConvertToDraft,

    // The issue was created by converting a note in a project board to an issue.
    @SerialName("converted_note_to_issue")
    ConvertedNoteToIssue,

    // The issue was referenced from another issue.
    // The source attribute contains the id, actor, and
    // url of the reference's source.
    @SerialName("cross-referenced")
    Crossreferenced,

    // The issue was removed from a milestone.
    @SerialName("demilestoned")
    Demilestoned,

    // The pull request was deployed.
    @SerialName("deployed")
    Deployed,

    // The pull request deployment environment was changed.
    @SerialName("deployment_environment_changed")
    DeploymentEnvironmentChanged,

    // The issue or pull request was unlinked from another issue or pull request.
    @SerialName("disconnected")
    Disconnected,

    // The pull request’s branch was deleted.
    @SerialName("head_ref_deleted")
    HeadRefDeleted,

    // The pull request’s branch was restored.
    @SerialName("head_ref_restored")
    HeadRefRestored,

    // The pull request’s branch was force pushed to.
    @SerialName("head_ref_force_pushed")
    HeadRefForcePushed,

    // A label was added to the issue.
    @SerialName("labeled")
    Labeled,

    // The issue was locked by the actor.
    @SerialName("locked")
    Locked,

    // The actor was @mentioned in an issue body.
    @SerialName("mentioned")
    Mentioned,

    // A user with write permissions marked an issue as a duplicate of another issue or a pull request as a duplicate of another pull request.
    @SerialName("marked_as_duplicate")
    MarkedAsDuplicate,

    // The issue was merged by the actor. The commit_id attribute is the SHA1 of the HEAD commit that was merged.
    @SerialName("merged")
    Merged,

    // The issue was added to a milestone.
    @SerialName("milestoned")
    Milestoned,

    // The issue was moved between columns in a project board.
    @SerialName("moved_columns_in_project")
    MovedColumnsInProject,

    // An issue was pinned.
    @SerialName("pinned")
    Pinned,

    // The pull request is ready for review
    @SerialName("ready_for_review")
    ReadyForReview,

    // The issue was referenced from a commit message. The commit_id attribute is the commit SHA1 of where
    // that happened.
    @SerialName("referenced")
    Referenced,

    // The issue was removed from a project board.
    @SerialName("removed_from_project")
    RemovedFromProject,

    // The issue title was changed.
    @SerialName("renamed")
    Renamed,

    // The issue was reopened by the actor.
    @SerialName("reopened")
    Reopened,

    // The actor dismissed a review from the pull request.
    @SerialName("review_dismissed")
    ReviewDismissed,

    // The actor requested review from the subject on this pull request.
    @SerialName("review_requested")
    ReviewRequested,

    // The actor removed the review request for the subject on this pull request.
    @SerialName("review_request_removed")
    ReviewRequestRemoved,

    // The issue was reviewed.
    @SerialName("reviewed")
    Reviewed,

    // The actor subscribed to receive notifications for an issue.
    @SerialName("subscribed")
    Subscribed,

    // An issue was transferred.
    @SerialName("transferred")
    Transferred,

    // The issue was unassigned to the actor.
    @SerialName("unassigned")
    Unassigned,

    // A label was removed from the issue.
    @SerialName("unlabeled")
    Unlabeled,

    // The issue was unlocked by the actor.
    @SerialName("unlocked")
    Unlocked,

    // An issue that a user had previously marked as a duplicate of another issue is no longer considered a duplicate.
    @SerialName("unmarked_as_duplicate")
    UnmarkedAsDuplicate,

    // An issue was unpinned.
    @SerialName("unpinned")
    Unpinned,

    // The actor unsubscribed from notifications for an issue.
    @SerialName("unsubscribed")
    Unsubscribed,

    // An organization owner blocked a user from the organization.
    @SerialName("user_blocked")
    UserBlocked,

    // A line comment was made.
    @SerialName("line-commented")
    LineCommented,

    // A commit comment was made.
    @SerialName("commit-commented")
    CommitCommented,

    // An issue comment was deleted.
    @SerialName("comment_deleted")
    CommentDeleted,
}
