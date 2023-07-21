package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable

/*
  "required": [
    "name",
    "commit",
    "_links",
    "protection",
    "protected",
    "protection_url"
  ]
 */

@Serializable
public data class Branch(
    val name: String,
    val commit: GitReference,
    val protected: Boolean,
)

