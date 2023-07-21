package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents response of the repositories for a secret in an organization.
@Serializable
public data class OrganizationSecretRepositoryCollection(val count: Int, val repositories: List<Repository>)