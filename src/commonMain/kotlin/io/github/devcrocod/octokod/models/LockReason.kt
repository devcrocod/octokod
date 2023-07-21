package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName

// The possible reasons that an issue or pull request was locked.
public enum class LockReason {
    // The issue or pull request was locked because the conversation was off-topic.
    @SerialName("off-topic")
    OffTopic,

    // The issue or pull request was locked because the conversation was resolved.
    @SerialName("resolved")
    Resolved,

    // The issue or pull request was locked because the conversation was spam.
    @SerialName("spam")
    Spam,

    // The issue or pull request was locked because the conversation was too heated.
    @SerialName("too heated")
    TooHeated
}