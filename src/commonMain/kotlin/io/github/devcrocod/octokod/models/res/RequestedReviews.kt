package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Users and teams requested to review a pull request

@Serializable
public data class RequestedReviews(val users: List<User>, val teams: List<Team>)