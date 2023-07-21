package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class GpgKey(
    val id: Int,
    @SerialName("primary_key_id")
    val primaryKeyId: Int?,
    @SerialName("key_id")
    val keyId: String,
    @SerialName("public_key")
    val publicKey: String,
    val emails: List<EmailAddress>,
    val subkeys: List<GpgKey>,
    val canSign: Boolean,
    @SerialName("can_encrypt_communications")
    val canEncryptCommunications: Boolean,
    @SerialName("can_encrypt_storage")
    val canEncryptStorage: Boolean,
    @SerialName("can_certify")
    val canCertify: Boolean,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("expires_at")
    val expiresAt: LocalDateTime?
)