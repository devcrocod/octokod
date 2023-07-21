package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public sealed class SearchResult<T> {
    @SerialName("total_count")
    public abstract val totalCount: Int

    @SerialName("incomplete_results")
    public abstract val incompleteResults: Boolean
    public abstract val items: List<T>
}