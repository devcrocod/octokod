package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Filter jobs for a workflow run.
// See https://developer.github.com/v3/actions/workflow-jobs/#list-jobs-for-a-workflow-run for details.
@Serializable
public enum class WorkflowRunJobsFilter {

    // Returns jobs from the most recent execution of the workflow run.
    @SerialName("latest")
    Latest,

    // Returns all jobs for a workflow run, including from old executions of the workflow run.
    @SerialName("all")
    All,
}