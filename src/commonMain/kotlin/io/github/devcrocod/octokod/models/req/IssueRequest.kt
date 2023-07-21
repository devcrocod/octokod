package io.github.devcrocod.octokod.models.req

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Used to filter a request to list issues.
@Serializable
public class IssueRequest : RequestParameters()

// The range of filters available for issues.
// http://developer.github.com/v3/issues/#list-issues
@Serializable
public enum class IssueFilter {
    // Issues assigned to the authenticated user. (Default)
    @SerialName("assigned")
    Assigned,

    // Issues created by the authenticated user.
    @SerialName("created")
    Created,

    // Issues mentioning the authenticated user.
    @SerialName("mentioned")
    Mentioned,

    // Issues the authenticated user is subscribed to for updates.
    @SerialName("subscribed")
    Subscribed,

    // All issues the authenticated user can see, regardless of participation or creation.
    @SerialName("all")
    All
}

// Range of states for Issues, Milestones and PullRequest API.
@Serializable
public enum class ItemStateFilter {
    // Items that are open.
    @SerialName("open")
    Open,

    // Items that are closed.
    @SerialName("closed")
    Closed,

    // All the items.
    @SerialName("all")
    All
}

// Items that are open OR closed
@Serializable
public enum class ItemState {
    // Items that are open
    @SerialName("open")
    Open,

    // Items that are closed
    @SerialName("closed")
    Closed
}

// The reason for the state change.
@Serializable
public enum class ItemStateReason {
    // Item closed as completed.
    @SerialName("completed")
    Completed,

    // Item closed as unplanned.
    @SerialName("not_planned")
    NotPlanned,

    // Item reopened.
    @SerialName("reopened")
    Reopened
}

// The available properties to sort issues by.
@Serializable
public enum class IssueSort {
    // Sort by create date (default)
    @SerialName("created")
    Created,

    // Sort by the date of the last update
    @SerialName("updated")
    Updated,

    // Sort by the number of comments
    @SerialName("comments")
    Comments
}

// The two possible sort directions.
@Serializable
public enum class SortDirection {
    // Sort ascending
    @SerialName("asc")
    Ascending,

    // Sort descending
    @SerialName("desc")
    Descending
}
