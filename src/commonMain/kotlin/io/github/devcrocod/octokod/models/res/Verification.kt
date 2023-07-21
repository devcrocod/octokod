package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents a Signature Verification Object in Git Data Commit Payload.
@Serializable
public data class Verification(
    val verified: Boolean,
    val reason: VerificationReason,
    val signature: String,
    val payload: String
)

@Serializable
public enum class VerificationReason {
    @SerialName("expired_key")
    ExpiredKey,

    @SerialName("not_signing_key")
    NotSigningKey,

    @SerialName("gpgverify_error")
    GpgVerifyError,

    @SerialName("gpgverify_unavailable")
    GpgVerifyUnavailable,

    @SerialName("unsigned")
    Unsigned,

    @SerialName("unknown_signature_type")
    UnknownSignatureType,

    @SerialName("no_user")
    NoUser,

    @SerialName("unverified_email")
    UnverifiedEmail,

    @SerialName("bad_email")
    BadEmail,

    @SerialName("unknown_key")
    UnknownKey,

    @SerialName("malformed_signature")
    MalformedSignature,

    @SerialName("invalid")
    Invalid,

    @SerialName("valid")
    Valid
}