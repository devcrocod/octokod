package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CompareResult(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("permalink_url")
    val permalinkUrl: String,
    @SerialName("diff_url")
    val diffUrl: String,
    @SerialName("patch_url")
    val patchUrl: String,
    @SerialName("")
    val baseCommit: GitHubCommit,
    @SerialName("merge_base_commit")
    val mergeBaseCommit: GitHubCommit,
    val status: String,
    @SerialName("ahead_by")
    val aheadBy: Int,
    @SerialName("behind_by")
    val behindBy: Int,
    @SerialName("total_commits")
    val totalCommits: Int,
    val commits: List<GitHubCommit>,
    val files: List<GitHubCommitFile>
)