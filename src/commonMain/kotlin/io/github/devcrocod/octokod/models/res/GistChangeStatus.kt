package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Used by <see cref="GistHistory"/> to indicate the level of change.
@Serializable
public data class GistChangeStatus(val deletions: Int, val additions: Int, val total: Int)