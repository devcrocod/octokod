package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.req.ItemState
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Project(
    @SerialName("owner_url")
    val ownerUrl: String,
    val url: String,
    val htmlUrl: String,
    val id: Int,
    val nodeId: String,
    val name: String,
    val body: String,
    val number: Int,
    val state: ItemState,
    val creator: User,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime
)