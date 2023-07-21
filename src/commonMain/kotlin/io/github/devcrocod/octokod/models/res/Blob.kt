package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Blob(
    @SerialName("node_id")
    val nodeId: String,
    val content: String,
    val encoding: EncodingType,
    val sha: String,
    val size: String
) {

    public enum class EncodingType {
        @SerialName("utf-8")
        Utf8,

        @SerialName("base64")
        Base64
    }
}
