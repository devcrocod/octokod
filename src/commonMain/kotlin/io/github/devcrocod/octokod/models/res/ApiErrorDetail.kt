package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable

@Serializable
public data class ApiErrorDetail(val message: String, val code: String, val field: String, val resource: String)
