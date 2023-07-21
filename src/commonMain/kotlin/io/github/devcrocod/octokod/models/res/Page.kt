package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public enum class PagesBuildStatus {
    //  The site has yet to be built
    @SerialName("null")
    Null,

    // The build has been requested but not yet begun
    @SerialName("queued")
    Queued,

    // The build is in progress
    @SerialName("building")
    Building,

    // The site has been built
    @SerialName("built")
    Built,

    // An error occurred during the build
    @SerialName("errored")
    Errored
}

// Information about your GitHub Pages configuration
@Serializable
public data class Page(
    val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val status: PagesBuildStatus,
    val cname: String,
    val custom404: Boolean
)
