package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline


@JvmInline
@Serializable
public value class WorkflowBillableTiming(@SerialName("total_ms") public val totalMs: Long)