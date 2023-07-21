package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Represents response of secrets for an organization.
@Serializable
public data class OrganizationSecretsCollection(val count: Int, val secrets: List<OrganizationSecret>)