package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public sealed interface LicenseMeta {
    public val key: String
    @SerialName("node_id")
    public val nodeId: String
    public val name: String
    @SerialName("spdx_id")
    public val spdxId: String
    public val url: String
    public val featured: Boolean
}

@Serializable
public data class LicenseMetadata(
    override val key: String,
    @SerialName("node_id")
    override val nodeId: String,
    override val name: String,
    @SerialName("spdx_id")
    override val spdxId: String,
    override val url: String,
    override val featured: Boolean
): LicenseMeta