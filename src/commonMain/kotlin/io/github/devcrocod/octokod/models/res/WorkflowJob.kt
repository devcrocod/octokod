package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowJob(
    val id: Long,
    @SerialName("run_id")
    val runId: Long,
    @SerialName("run_url")
    val runUrl: String,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("head_sha")
    val headSha: String,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val status: WorkflowJobStatus,
    val conclusion: WorkflowJobConclusion?,
    @SerialName("started_at")
    val startedAt: LocalDateTime,
    @SerialName("completed_at")
    val completedAt: LocalDateTime?,
    val name: String,
    val steps: List<WorkflowJobStep>,
    @SerialName("check_run_url")
    val checkRunUrl: String,
    val labels: List<String>,
    @SerialName("runner_id")
    val runnerId: Long,
    @SerialName("runner_name")
    val runnerName: String,
    @SerialName("runner_group_id")
    val runnerGroupId: Long,
    @SerialName("runner_group_name")
    val runnerGroupName: String
)