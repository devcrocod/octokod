package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Plan(
    val collaborators: Long,
    val name: String,
    @SerialName("private_repos")
    val privateRepos: Long,
    val space: Long,
    @SerialName("billing_email")
    val billingEmail: String,
    @SerialName("filled_seats")
    val filledSeats: Int,
    val seats: Int
)