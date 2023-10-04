package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.*
import kotlinx.serialization.Contextual
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("LocalDateTime", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        encoder.encodeString(value.toInstant(TimeZone.UTC).toString())
    }

    override fun deserialize(decoder: Decoder): LocalDateTime {
        return Instant.parse(decoder.decodeString()).toLocalDateTime(TimeZone.UTC)
    }
}


@Serializable
public data class User(
    val login: String,
    val id: Int,
    val nodeId: String,
    val avatarUrl: String,
    val gravatarId: String?,
    val url: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followingUrl: String,
    val gistsUrl: String,
    val starredUrl: String,
    val subscriptionsUrl: String,
    val organizationsUrl: String,
    val reposUrl: String,
    val eventsUrl: String,
    val receivedEventsUrl: String,
    val type: String,
    val siteAdmin: Boolean,
    val name: String?,
    val company: String?,
    val blog: String?,
    val location: String?,
    val email: String?,
    val hireable: Boolean?,
    val bio: String?,
    val twitterUsername: String?,
    val publicRepos: Int,
    val publicGists: Int,
    val followers: Int,
    val following: Int,
    @Contextual
    val createdAt: LocalDateTime,
    @Contextual
    val updatedAt: LocalDateTime,
    val twoFactorAuthentication: Boolean?,
    val plan: Plan,
    @Contextual
    val suspendedAt: LocalDateTime?,
    val privateGists: Int,
    val totalPrivateRepos: Int,
    val ownedPrivateRepos: Int,
    val diskUsage: Int,
    val collaborators: Int,
    val businessPlus: Boolean?,
    val ldapDn: String?
)
