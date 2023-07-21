package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("user")
public data class User(
    @SerialName("avatar_url")
    override val avatarUrl: String,
    override val bio: String,
    override val blog: String,
    override val collaborators: Int,
    override val company: String,
    @SerialName("created_at")
    override val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    @SerialName("disk_usage")
    override val diskUsage: Int,
    override val email: String,
    override val followers: Int,
    override val following: Int,
    override val hireable: Boolean?,
    @SerialName("html_url")
    override val htmlUrl: String,
    @SerialName("total_private_repos")
    override val totalPrivateRepos: Int,
    override val id: Int,
    override val location: String,
    override val login: String,
    override val name: String,
    @SerialName("node_id")
    override val nodeId: String,
    @SerialName("owned_private_repos")
    override val ownedPrivateRepos: Int,
    override val plan: Plan,
    @SerialName("private_gists")
    override val privateGists: Int,
    @SerialName("public_gists")
    override val publicGists: Int,
    @SerialName("public_repos")
    override val publicRepos: Int,
    override val url: String,
    val permissions: RepositoryPermissions,
    @SerialName("site_admin")
    val siteAdmin: Boolean,
    @SerialName("ldap_distinguished_name")
    val ldapDistinguishedName: String,
    val suspendedAt: LocalDateTime?
) : Account(AccountType.User)