package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents an environment for a deployment approval.
@Serializable
public data class EnvironmentApprovals(
    val environments: List<EnvironmentApproval>,
    val user: User,
    val state: EnvironmentApprovalState,
    val comment: String
)