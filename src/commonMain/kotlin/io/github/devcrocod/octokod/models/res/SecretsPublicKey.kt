package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents the public key used to sign the secrets to post to GitHub
@Serializable
public data class SecretsPublicKey(
    @SerialName("key_id")
    val keyId: String,
    val key: String
)