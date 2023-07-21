package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents an application installation.

// For more information see https://docs.github.com/en/rest/apps/installations?apiVersion=2022-11-28#list-app-installations-accessible-to-the-user-access-token
@Serializable
public data class Installation(
    override val id: Long,
    val account: User,
    @SerialName("access_tokens_url")
    val accessTokensUrl: String,
    @SerialName("repositories_url")
    val repositoriesUrl: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("app_id")
    val appId: Long,
    @SerialName("target_id")
    val targetId: Long,
    @SerialName("target_type")
    val targetType: AccountType,
    val permissions: InstallationPermissions,
    val events: List<String>,
    @SerialName("single_file_name")
    val singleFileName: String,
    @SerialName("repository_selection")
    val repositorySelection: String
) : InstallId

@Serializable
public enum class InstallationRepositorySelection {
    @SerialName("all")
    All,

    @SerialName("selected")
    Selected
}
