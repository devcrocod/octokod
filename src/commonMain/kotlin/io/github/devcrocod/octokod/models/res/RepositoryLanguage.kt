package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryLanguage(val name: String, @SerialName("number_of_bytes") val numberOfBytes: LocalDateTime)