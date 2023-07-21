package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowJobStep(
    val name: String,
    val status: WorkflowJobStatus,
    val conclusion: WorkflowJobConclusion,
    val number: Int,
    @SerialName("started_at")
    val startedAt: LocalDateTime?,
    @SerialName("completed_at")
    val completedAt: LocalDateTime?
)