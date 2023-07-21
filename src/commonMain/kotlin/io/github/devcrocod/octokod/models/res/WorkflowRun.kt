package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowRun(
    val id: Long,
    val name: String,
    @SerialName("node_id")
    val nodeId: String,
    @SerialName("check_suite_id")
    val checkSuiteId: Long,
    @SerialName("check_suite_node_id")
    val checkSuiteNodeId: String,
    @SerialName("head_branch")
    val headBranch: String,
    @SerialName("head_sha")
    val headSha: String,
    val path: String,
    @SerialName("run_number")
    val runNumber: Long,
    val event: String,
    @SerialName("display_title")
    val displayTitle: String,
    val status: WorkflowRunStatus,
    val conclusion: WorkflowRunConclusion?,
    @SerialName("workflow_id")
    val workflowId: Long,
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val pullRequests: List<PullRequest>,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val actor: User,
    @SerialName("run_attempt")
    val runAttempt: Long,
    @SerialName("referenced_workflows")
    val referencedWorkflows: List<WorkflowReference>,
    @SerialName("run_started_at")
    val runStartedAt: LocalDateTime,
    @SerialName("triggering_Actor")
    val triggeringActor: User,
    @SerialName("jobs_url")
    val jobsUrl: String,
    @SerialName("logs_url")
    val logsUrl: String,
    @SerialName("check_suite_url")
    val checkSuiteUrl: String,
    @SerialName("artifacts_url")
    val artifactsUrl: String,
    @SerialName("cancel_url")
    val cancelUrl: String,
    @SerialName("rerun_url")
    val rerunUrl: String,
    @SerialName("previous_attempt_url")
    val previousAttemptUrl: String,
    @SerialName("workflow_url")
    val workflowUrl: String,
    @SerialName("head_commit")
    val headCommit: Commit,
    val repository: Repository,
    @SerialName("head_repository")
    val headRepository: Repository,
    @SerialName("head_repository_id")
    val headRepositoryId: Long,
)