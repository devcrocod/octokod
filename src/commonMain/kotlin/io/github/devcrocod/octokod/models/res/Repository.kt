package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Repository(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val cloneUrl: String,
    val gitUrl: String,
    val sshUrl: String,
    val svnUrl: String,
    val mirrorUrl: String,
    val id: Long,
    @SerialName("node_id")
    val nodeId: String,
    val owner: User,
    val name: String,
    val fullName: String,
    val isTemplate: Boolean,
    val description: String,
    val homepage: String,
    val language: String,
    val private: Boolean,
    val fork: Boolean,
    val forksCount: Int,
    val stargazersCount: Int,
    val defaultBranch: String,
    val openIssuesCount: Int,
    val pushedAt: LocalDateTime?,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    val permissions: RepositoryPermissions,
    val parent: Repository?,
    val source: Repository?,
    val license: LicenseMetadata,
    val hasIssues: Boolean,
    val hasWiki: Boolean,
    val hasDownloads: Boolean,
    val hasPages: Boolean,
    val subscribersCount: Int,
    val size: Long,
    val allowRebaseMerge: Boolean?,
    val allowSquashMerge: Boolean?,
    val allowMergeCommit: Boolean?,
    val archived: Boolean,
    val watchersCount: Int,
    val deleteBranchOnMerge: Boolean?,
    val visibility: RepositoryVisibility,
    val topics: List<String>,
    val allowAutoMerge: Boolean?,
    val allowUpdateBranch: Boolean?
)
