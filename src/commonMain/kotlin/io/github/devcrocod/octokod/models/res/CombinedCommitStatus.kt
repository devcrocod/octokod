package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CombinedCommitStatus(
    val state: CommitState,
    val sha: String,
    @SerialName("total_count")
    val totalCount: Int,
    val statuses: List<CommitStatus>,
    val repository: Repository
)