package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
public sealed interface InstallId {
    public val id: Long
}

@Serializable
public data class InstallationId(override val id: Long) : InstallId
