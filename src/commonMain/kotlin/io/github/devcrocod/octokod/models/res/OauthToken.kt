package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class OauthToken(
    @SerialName("token_type")
    val tokenType: String,
    @SerialName("access_token")
    val accessToken: String,
    val scope: List<String>,
    val error: String,
    @SerialName("error_description")
    val errorDescription: String,
    @SerialName("error_uri")
    val errorUri: String
)