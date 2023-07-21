package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Enables or disables automatic creation of CheckSuite events upon pushes to the repository
@Serializable
public data class CheckSuitePreferenceAutoTrigger(@SerialName("app_id") val appId: Long, val setting: Boolean)