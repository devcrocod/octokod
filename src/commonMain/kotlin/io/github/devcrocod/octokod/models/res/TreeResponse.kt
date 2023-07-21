package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class TreeResponse(val sha: String, val url: String, val tree: List<TreeItem>, val truncated: Boolean)