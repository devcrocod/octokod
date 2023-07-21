package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// The response from the Repository Contents API. The API assumes a dynamic client type so we need
// to model that.

//https://developer.github.com/v3/repos/contents/
@Serializable
public data class RepositoryContentChangeSet(val content: RepositoryContentInfo, val commit: Commit)