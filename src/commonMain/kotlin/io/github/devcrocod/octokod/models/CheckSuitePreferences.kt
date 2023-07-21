package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Check Suite preferences
@Serializable
public data class CheckSuitePreferences(@SerialName("auto_trigger_checks") val autoTriggerChecks: List<CheckSuitePreferenceAutoTrigger>)