package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.InstallationReadPermissionLevel
import io.github.devcrocod.octokod.models.InstallationReadWriteAdminPermissionLevel
import io.github.devcrocod.octokod.models.InstallationReadWritePermissionLevel
import io.github.devcrocod.octokod.models.InstallationWritePermissionLevel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// The permissions granted to the user-to-server access token.
@Serializable
public data class InstallationPermissions(
    val actions: InstallationReadWritePermissionLevel?,
    val administration: InstallationReadWritePermissionLevel?,
    val checks: InstallationReadWritePermissionLevel?,
    val contents: InstallationReadWritePermissionLevel?,
    val deployments: InstallationReadWritePermissionLevel?,
    val environments: InstallationReadWritePermissionLevel?,
    val issues: InstallationReadWritePermissionLevel?,
    val metadata: InstallationReadWritePermissionLevel?,
    val packages: InstallationReadWritePermissionLevel?,
    val pages: InstallationReadWritePermissionLevel?,
    @SerialName("pull_requests")
    val pullRequests: InstallationReadWritePermissionLevel?,
    @SerialName("repository_announcement_banners")
    val repositoryAnnouncementBanners: InstallationReadWritePermissionLevel?,
    @SerialName("repository_hooks")
    val repositoryHooks: InstallationReadWritePermissionLevel?,
    @SerialName("repository_projects")
    val repositoryProjects: InstallationReadWriteAdminPermissionLevel?,
    @SerialName("secret_scanning_alerts")
    val secretScanningAlerts: InstallationReadWritePermissionLevel?,
    val secrets: InstallationReadWritePermissionLevel?,
    @SerialName("security_events")
    val securityEvents: InstallationReadWritePermissionLevel?,
    @SerialName("single_file")
    val singleFile: InstallationReadWritePermissionLevel?,
    val statuses: InstallationReadWritePermissionLevel?,
    @SerialName("vulnerability_alerts")
    val vulnerabilityAlerts: InstallationReadWritePermissionLevel?,
    val workflows: InstallationWritePermissionLevel?,
    val members: InstallationReadWritePermissionLevel?,
    @SerialName("organization_administration")
    val organizationAdministration: InstallationReadWritePermissionLevel?,
    @SerialName("organization_custom_roles")
    val organizationCustomRoles: InstallationReadWritePermissionLevel?,
    @SerialName("organization_announcement_banners")
    val organizationAnnouncementBanners: InstallationReadWritePermissionLevel?,
    @SerialName("organization_hooks")
    val organizationHooks: InstallationReadWritePermissionLevel?,
    @SerialName("organization_plan")
    val organizationPlan: InstallationReadPermissionLevel?,
    @SerialName("organization_projects")
    val organizationProjects: InstallationReadWriteAdminPermissionLevel?,
    @SerialName("organization_packages")
    val organizationPackages: InstallationReadWritePermissionLevel?,
    @SerialName("organization_secrets")
    val organizationSecrets: InstallationReadWritePermissionLevel?,
    @SerialName("organization_self_hosted_runners")
    val organizationSelfHostedRunners: InstallationReadWritePermissionLevel?,
    @SerialName("organization_user_blocking")
    val organizationUserBlocking: InstallationReadWritePermissionLevel?,
    @SerialName("team_discussions")
    val teamDiscussions: InstallationReadWritePermissionLevel?
)