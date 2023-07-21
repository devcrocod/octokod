package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.PackageType
import io.github.devcrocod.octokod.models.PackageVisibility
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class Package(
    val id: Long,
    val name: String,
    @SerialName("package_type")
    val packageType: PackageType,
    val owner: Author,
    @SerialName("version_count")
    val versionCount: Int,
    val visibility: PackageVisibility,
    val url: String,
    @SerialName("created_at")
    val createdAt: LocalDateTime,
    @SerialName("updated_at")
    val updatedAt: LocalDateTime,
    @SerialName("html_url")
    val htmlUrl: String
)