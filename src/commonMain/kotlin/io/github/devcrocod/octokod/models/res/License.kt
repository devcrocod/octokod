package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class License(
    override val key: String,
    override val nodeId: String,
    override val name: String,
    @SerialName("spdx_id")
    override val spdxId: String,
    override val url: String,
    @SerialName("html_url")
    val htmlUrl: String,
    override val featured: Boolean,
    val description: String,
    val category: String,
    val implementation: String,
    val body: String,
    val required: List<String>,
    val permitted: List<String>,
    val forbidden: List<String>
) : LicenseMeta