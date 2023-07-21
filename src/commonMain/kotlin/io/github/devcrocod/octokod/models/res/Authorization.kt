package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable


// Application Authorization
@Serializable
public data class Authorization(
    val  id: Int,
    val  url: String,
    val  application: Application,
    val  tokenLastEight: String,
    val  hashedToken: String,
    val  fingerprint: String,
    val  note: String,
    val  noteUrl: String,
    val  createdAt: LocalDateTime,
    val  updateAt: LocalDateTime,
    val  scopes: List<String>,
    val  token: String
)
