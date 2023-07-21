package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class WorkflowReference(
    val path: String, val sha: String, val ref: String
)