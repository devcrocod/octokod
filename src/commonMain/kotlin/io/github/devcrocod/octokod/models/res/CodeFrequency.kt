package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents the summary of lines added and deleted
@Serializable
public data class CodeFrequency(@SerialName("additions_and_deletions_by_week") val additionsAndDeletionsByWeek: List<AdditionsAndDeletions>)