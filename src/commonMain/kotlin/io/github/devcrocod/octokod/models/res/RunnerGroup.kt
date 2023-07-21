package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RunnerGroup(
    val id: Long,
    val name: String,
    val visibility: String,
    val default: Boolean,
    @SerialName("runners_url")
    val runnersUrl: String,
    val inherited: Boolean,
    @SerialName("allows_public_repositories")
    val allowsPublicRepositories: Boolean,
    @SerialName("restricted_to_workflows")
    val restrictedToWorkflows: Boolean,
    @SerialName("selected_workflows")
    val selectedWorkflows: List<String>,
    @SerialName("workflow_restrictions_read_only")
    val workflowRestrictionsReadOnly: Boolean
)