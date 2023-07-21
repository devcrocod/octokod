package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class CommitActivity(val activity: List<WeeklyCommitActivity>)