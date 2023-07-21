package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class DismissedReviewInfo(
    val state: PullRequestReviewState,
    @SerialName("review_id")
    val reviewId: String,
    @SerialName("dismissal_message")
    val dismissalMessage: String,
    @SerialName("dismissal_commit_id")
    val dismissalCommitId: String
)