package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public sealed class Account {
    public abstract val login: String
    public abstract val id: Int
    public abstract val avatarUrl: String
    public abstract val bio: String
    public abstract val blog: String
    public abstract val collaborators: Int
    public abstract val company: String
    public abstract val createdAt: String
    public abstract val diskUsage: Int
    public abstract val email: String
    public abstract val followers: Int
    public abstract val following: Int
    public abstract val hireable: Boolean?
    public abstract val htmlUrl: String
    public abstract val totalPrivateRepos: Int
    public abstract val location: String
    public abstract val name: String
    public abstract val nodeId: String
    public abstract val ownedPrivateRepos: Int
    public abstract val plan: Plan
    public abstract val privateGists: Int
    public abstract val publicGists: Int
    public abstract val publicRepos: Int
    public abstract val url: String
}
