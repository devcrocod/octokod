package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Response from the /meta endpoint that provides information about GitHub.com or a GitHub Enterprise instance.

// @param verifiablePasswordAuthentication Whether authentication with username and password is supported.
// @param gitHubServicesSha The currently-deployed SHA of github-services.
// @param hooks An array of IP addresses in CIDR format specifying the addresses that incoming service hooks will originate from on GitHub.com.
// @param web An array of IP addresses in CIDR format specifying the Web servers for GitHub
// @param api An array of IP addresses in CIDR format specifying the Api servers for GitHub
// @param git An array of IP addresses in CIDR format specifying the Git servers for the GitHub server
// @param packages An array of IP addresses in CIDR format specifying the Packages servers for GitHub
// @param pages An array of IP addresses in CIDR format specifying the A records for GitHub Pages.
// @param importer An Array of IP addresses specifying the addresses that source imports will originate from on GitHub.com.
// @param actions An array of IP addresses in CIDR format specifying the Actions servers for GitHub
// @param dependabot An array of IP addresses in CIDR format specifying the Dependabot servers for GitHub
// @param installedVersion The installed version of GitHub Enterprise Server
@Serializable
public data class Meta(
    @SerialName("verifiable_password_Authentication")
    val verifiablePasswordAuthentication: Boolean,
    @SerialName("gitHub_Services_Sha")
    val gitHubServicesSha: String,
    val hooks: List<String>,
    val web: List<String>,
    val api: List<String>,
    val git: List<String>,
    val packages: List<String>,
    val pages: List<String>,
    val importer: List<String>,
    val actions: List<String>,
    val dependabot: List<String>,
    @SerialName("installed_version")
    val installedVersion: String
)