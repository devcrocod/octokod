package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// The possible repository content types.
@Serializable
public enum class ContentType {
    @SerialName("file")
    File,

    @SerialName("dir")
    Dir,

    @SerialName("symlink")
    Symlink,

    @SerialName("submodule")
    Submodule
}