package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
public value class BlobReference(public val sha: String)