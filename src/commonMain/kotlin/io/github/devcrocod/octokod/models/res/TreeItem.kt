package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class TreeItem(
    val path: String,
    val mode: String,
    val type: TreeType,
    val size: Int,
    val sha: String,
    val url: String
)

@Serializable
public enum class TreeType {
    @SerialName("blob")
    Blob,

    @SerialName("tree")
    Tree,

    @SerialName("commit")
    Commit
}


// The file mode to associate with a tree item
public object FileMode {
    // Mark the tree item as a file (applicable to blobs only)
    public const val FILE: String = "100644"

    // Mark the tree item as an executable (applicable to blobs only)
    public const val EXECUTABLE: String = "100755"

    // Mark the tree item as a subdirectory (applicable to trees only)
    public const val SUBDIRECTORY: String = "040000"

    // Mark the tree item as a submodule (applicable to commits only)
    public const val SUBMODULE: String = "160000"

    // Mark the tree item as a symlink (applicable to blobs only)
    public const val SYMLINK: String = "120000"
}
