package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class IssueEventProjectCard(
    val id: Long,
    val url: String,
    @SerialName("project_id")
    val projectId: Long,
    @SerialName("project_url")
    val projectUrl: String,
    @SerialName("column_name")
    val columnName: String,
    @SerialName("previous_column_name")
    val previousColumnName: String
)