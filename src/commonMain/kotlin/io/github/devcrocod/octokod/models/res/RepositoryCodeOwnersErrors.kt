package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class RepositoryCodeOwnersErrors(val errors: List<RepositoryCodeOwnersError>) {

    @Serializable
    public data class RepositoryCodeOwnersError(
        val line: Int,
        val column: Int,
        val kind: String,
        val source: String,
        val suggestion: String,
        val message: String,
        val path: String
    )
}