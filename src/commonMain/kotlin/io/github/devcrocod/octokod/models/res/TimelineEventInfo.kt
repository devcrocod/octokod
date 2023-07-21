package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class TimelineEventInfo(
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val url: String,
    val actor: User,
    @SerialName("commit_id")
    val commitId: String,
    val event: EventInfoState,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    val label: Label,
    val assignee: User,
    val milestone: Milestone,
    val source: SourceInfo,
    val rename: RenameInfo,
    @SerialName("project_card")
    val projectCard: IssueEventProjectCard
)