package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
public data class BranchProtectionSettings(
    @SerialName("required_status_checks")
    val requiredStatusChecks: BranchProtectionRequiredStatusChecks,
    @SerialName("required_pull_request_reviews")
    val requiredPullRequestReviews: BranchProtectionRequiredReviews,
    val restrictions: BranchProtectionPushRestrictions,
    @SerialName("enforce_admins")
    val enforceAdmins: EnforceAdmins,
    @SerialName("required_linear_history")
    val requiredLinearHistory: BranchProtectionEnabledCommon,
    @SerialName("allow_force_pushes")
    val allowForcePushes: BranchProtectionEnabledCommon,
    @SerialName("allow_deletions")
    val allowDeletions: BranchProtectionEnabledCommon,
    @SerialName("block_creations")
    val blockCreations: BranchProtectionEnabledCommon,
    @SerialName("required_conversation_resolution")
    val requiredConversationResolution: BranchProtectionEnabledCommon,
    @SerialName("required_signature")
    val requiredSignatures: BranchProtectionEnabledCommon
)

@JvmInline
@Serializable
public value class EnforceAdmins(public val enabled: Boolean)

// Specifies settings for status checks which must pass before branches can be merged into the protected branch
@Serializable
public data class BranchProtectionRequiredStatusChecks(val strict: String, val contexts: List<String>)

// Specifies people or teams allowed to push to the protected branch. Required status checks will still prevent these people from merging if the checks fail
@Serializable
public data class BranchProtectionPushRestrictions(val teams: List<Team>, val users: List<User>)

// Specifies if pull request reviews are required before merging a pull request. Can optionally enforce the policy on repository administrators also.
@Serializable
public data class BranchProtectionRequiredReviews(
    @SerialName("dismissal_restrictions")
    val dismissalRestrictions: BranchProtectionRequiredReviewsDismissalRestrictions,
    @SerialName("dismiss_stale_reviews")
    val dismissStaleReviews: Boolean,
    @SerialName("require_code_owner_reviews")
    val requireCodeOwnerReviews: Boolean,
    @SerialName("required_approving_review_count")
    val requiredApprovingReviewCount: Int
)

// Specifies people or teams allowed to push to the protected branch. Required status checks will still prevent these people from merging if the checks fail
@Serializable
public data class BranchProtectionRequiredReviewsDismissalRestrictions(
    val teams: List<Team>,
    val users: List<User>
)

@JvmInline
@Serializable
public value class BranchProtectionEnabledCommon(public val enabled: Boolean)
