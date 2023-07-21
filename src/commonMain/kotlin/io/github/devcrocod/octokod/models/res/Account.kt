package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public sealed class Account(public val type: AccountType) {
    @SerialName("avatar_url")
    public abstract val avatarUrl: String
    public abstract val bio: String
    public abstract val blog: String
    public abstract val collaborators: Int
    public abstract val company: String

    @SerialName("created_at")
    public abstract val createdAt: LocalDateTime

    @SerialName("disk_usage")
    public abstract val diskUsage: Int
    public abstract val email: String
    public abstract val followers: Int
    public abstract val following: Int
    public abstract val hireable: Boolean?
    public abstract val htmlUrl: String

    @SerialName("total_private_repos")
    public abstract val totalPrivateRepos: Int
    public abstract val id: Int
    public abstract val location: String
    public abstract val login: String
    public abstract val name: String

    @SerialName("node_id")
    public abstract val nodeId: String

    @SerialName("owned_private_repos")
    public abstract val ownedPrivateRepos: Int
    public abstract val plan: Plan

    @SerialName("private_gists")
    public abstract val privateGists: Int

    @SerialName("public_gists")
    public abstract val publicGists: Int

    @SerialName("public_repos")
    public abstract val publicRepos: Int
    public abstract val url: String
}
