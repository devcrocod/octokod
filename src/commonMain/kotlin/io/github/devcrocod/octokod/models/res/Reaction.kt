package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class ReactionType {
    @SerialName("+1")
    Plus1,

    @SerialName("-1")
    Minus1,

    @SerialName("laugh")
    Laugh,

    @SerialName("confused")
    Confused,

    @SerialName("heart")
    Heart,

    @SerialName("hooray")
    Hooray,

    @SerialName("rocket")
    Rocket,

    @SerialName("eyes")
    Eyes
}

@Serializable
public data class Reaction(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val user: User,
    val content: ReactionType
)