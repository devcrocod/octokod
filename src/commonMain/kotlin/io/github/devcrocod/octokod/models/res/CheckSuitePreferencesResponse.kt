package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.CheckSuitePreferences
import kotlinx.serialization.Serializable


@Serializable
public data class CheckSuitePreferencesResponse(
    val preferences: CheckSuitePreferences,
    val repository: Repository
)