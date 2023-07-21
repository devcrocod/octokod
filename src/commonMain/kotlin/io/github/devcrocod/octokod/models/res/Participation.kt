package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Returns the total commit counts for the owner and total commit counts in total in the last 52 weeks
@Serializable
public data class Participation(val all: List<Int>, val owner: List<Int>)