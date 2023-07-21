package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents the response from an attempt to merge a pull request.

// Note the request to merge is represented by <see cref="MergePullRequest"/>
// API: https://developer.github.com/v3/pulls/#merge-a-pull-request-merge-button
@Serializable
public data class PullRequestMerge(val sha: String, val merged: Boolean, val message: String)