package io.github.devcrocod.octokod.models.res

import io.github.devcrocod.octokod.models.CheckAnnotationLevel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CheckRunAnnotation(
    val path: String,
    @SerialName("blob_href")
    val blobHref: String,
    @SerialName("start_line")
    val startLine: Int,
    @SerialName("end_line")
    val endLine: Int,
    @SerialName("start_column")
    val startColumn: Int?,
    @SerialName("end_column")
    val endColumn: Int?,
    @SerialName("annotation_level")
    val annotationLevel: CheckAnnotationLevel?,
    val message: String,
    val title: String,
    @SerialName("raw_details")
    val rawDetails: String
)
