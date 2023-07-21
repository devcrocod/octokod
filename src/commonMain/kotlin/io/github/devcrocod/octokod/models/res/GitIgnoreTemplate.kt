package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


@Serializable
public data class GitIgnoreTemplate(val name: String, val source: String)