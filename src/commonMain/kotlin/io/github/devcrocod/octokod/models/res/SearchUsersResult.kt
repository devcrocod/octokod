package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class SearchUsersResult(
    @SerialName("total_count")
    override val totalCount: Int,
    @SerialName("incomplete_results")
    override val incompleteResults: Boolean,
    override val items: List<User>
) : SearchResult<User>()