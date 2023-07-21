package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class OrganizationCredential(
    val login: String,
    @SerialName("credential_id")
    val credentialId: Long,
    @SerialName("credential_type")
    val credentialType: String,
    @SerialName("token_last_eight")
    val tokenLastEight: String,
    @SerialName("credential_authorized_at")
    val credentialAuthorizedAt: LocalDateTime,
    val scopes: List<String>,
    val fingerprint: String,
    @SerialName("credential_accessed_at")
    val credentialAccessedAt: LocalDateTime?,
    @SerialName("authorized_credential_id")
    val authorizedCredentialId: Long?,
    @SerialName("authorized_credential_title")
    val authorizedCredentialTitle: String,
    @SerialName("authorized_credential_note")
    val authorizedCredentialNote: String,
    @SerialName("authorized_credential_expires_at")
    val authorizedCredentialExpiresAt: LocalDateTime?
)