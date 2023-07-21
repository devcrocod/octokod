package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.TeamRepositoryPermissions
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// A teams's repository
@Serializable
public data class TeamRepository(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val name: String,
    @SerialName("full_name")
    val fullName: String,
    val license: LicenseMetadata,
    val permissions: TeamRepositoryPermissions,
    @SerialName("role_name")
    val roleName: String,
    val owner: User,
    val private: Boolean,
    @SerialName("html_url")
    val htmlUrl: String,
    val description: String,
    val fork: Boolean,
    val url: String,
    @SerialName("archive_url")
    val archiveUrl: String,
    @SerialName("assignees_url")
    val assigneesUrl: String,
    @SerialName("blobs_url")
    val blobsUrl: String,
    @SerialName("branches_url")
    val branchesUrl: String,
    @SerialName("collaborators_url")
    val collaboratorsUrl: String,
    @SerialName("comments_url")
    val commentsUrl: String,
    @SerialName("commits_url")
    val commitsUrl: String,
    @SerialName("compare_url")
    val compareUrl: String,
    @SerialName("contents_url")
    val contentsUrl: String,
    @SerialName("contributors_url")
    val contributorsUrl: String,
    @SerialName("deployments_url")
    val deploymentsUrl: String,
    @SerialName("downloads_url")
    val downloadsUrl: String,
    @SerialName("events_url")
    val eventsUrl: String,
    @SerialName("forks_url")
    val forksUrl: String,
    @SerialName("git_commit_url")
    val gitCommitUrl: String,
    @SerialName("git_refs_url")
    val gitRefsUrl: String,
    @SerialName("git_tags_url")
    val gitTagsUrl: String,
    @SerialName("git_url")
    val gitUrl: String,
    @SerialName("issue_comment_url")
    val issueCommentUrl: String,
    @SerialName("issue_events_url")
    val issueEventsUrl: String,
    @SerialName("issues_url")
    val issuesUrl: String,
    @SerialName("keys_url")
    val keysUrl: String,
    @SerialName("labels_url")
    val labelsUrl: String,
    @SerialName("languages_url")
    val languagesUrl: String,
    @SerialName("merges_url")
    val mergesUrl: String,
    @SerialName("milestones_url")
    val milestonesUrl: String,
    @SerialName("notifications_url")
    val notificationsUrl: String,
    @SerialName("pulls_url")
    val pullsUrl: String,
    @SerialName("releases_url")
    val releasesUrl: String,
    @SerialName("ssh_url")
    val sshUrl: String,
    @SerialName("stargazers_url")
    val stargazersUrl: String,
    @SerialName("statuses_url")
    val statusesUrl: String,
    @SerialName("subscribers_url")
    val subscribersUrl: String,
    @SerialName("subscription_url")
    val subscriptionUrl: String,
    @SerialName("tags_url")
    val tagsUrl: String,
    @SerialName("teams_url")
    val teamsUrl: String,
    @SerialName("trees_url")
    val treesUrl: String,
    @SerialName("clone_url")
    val cloneUrl: String,
    @SerialName("mirror_url")
    val mirrorUrl: String,
    @SerialName("hooks_url")
    val hooksUrl: String,
    @SerialName("svn_url")
    val svnUrl: String,
    @SerialName("home_page")
    val homePage: String,
    val language: String,
    @SerialName("forks_count")
    val forksCount: Int,
    @SerialName("stargazers_count")
    val stargazersCount: Int,
    @SerialName("watchers_count")
    val watchersCount: Int,
    val size: Int,
    @SerialName("default_Branch")
    val defaultBranch: String,
    @SerialName("open_issues_count")
    val openIssuesCount: Int,
    @SerialName("is_template")
    val isTemplate: Boolean,
    val topics: List<String>,
    @SerialName("has_issues")
    val hasIssues: Boolean,
    @SerialName("has_projects")
    val hasProjects: Boolean,
    @SerialName("has_wiki")
    val hasWiki: Boolean,
    @SerialName("has_pages")
    val hasPages: Boolean,
    @SerialName("has_downloads")
    val hasDownloads: Boolean,
    val archived: Boolean,
    val disabled: Boolean,
    val visibility: RepositoryVisibility?,
    @SerialName("pushed_at")
    val pushedAt: LocalDateTime?,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    @SerialName("allow_rebase_merge")
    val allowRebaseMerge: Boolean?,
    @SerialName("template_repository")
    val templateRepository: Repository,
    @SerialName("temp_clone_token")
    val tempCloneToken: String,
    @SerialName("allow_squash_merge")
    val allowSquashMerge: Boolean?,
    @SerialName("allow_auto_merge")
    val allowAutoMerge: Boolean?,
    @SerialName("delete_branch_on_merge")
    val deleteBranchOnMerge: Boolean?,
    @SerialName("allow_merge_commit")
    val allowMergeCommit: Boolean?,
    @SerialName("allow_forking")
    val allowForking: Boolean?,
    @SerialName("web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean?,
    @SerialName("subscribers_count")
    val subscribersCount: Int,
    @SerialName("network_count")
    val networkCount: Int,
    @SerialName("open_issues")
    val openIssues: Int,
    val watchers: Int,
    @SerialName("master_branch")
    val masterBranch: String
)