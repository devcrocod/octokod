package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline


@JvmInline
@Serializable
public value class CheckRunRequestedAction(
    public val identifier: String
)