package io.github.devcrocod.octokod.models.res

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class PackageVersion(
    val id: Long,
    val name: String,
    val url: String,
    @SerialName("package_html_url")
    val packageHtmlUrl: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: Long,
    @SerialName("html_url")
    val htmlUrl: String,
    val metadata: PackageVersionMetadata
)

@Serializable
public data class PackageVersionMetadata(
    @SerialName("package_type")
    val packageType: String,
    val container: PackageVersionMetadataContainer
)

@Serializable
public data class PackageVersionMetadataContainer(val tags: List<String>)
