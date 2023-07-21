package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


// Represents a migration.

// See <a href="https://developer.github.com/v3/migration/migrations/#start-a-migration">docs</a>
// for more information.
@Serializable
public data class Migration(
    val id: Int,
    @SerialName("node_id")
    val nodeId: String,
    val guid: String,
    val state: MigrationState,
    @SerialName("lock_repositories")
    val lockRepositories: Boolean,
    @SerialName("exclude_attachments")
    val excludeAttachments: Boolean,
    val url: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String,
    val repositories: List<Repository>
)

// State of a migration.
// See: https://developer.github.com/v3/migration/migrations/#get-the-status-of-a-migration
@Serializable
public enum class MigrationState {
    // The migration hasn't started yet.
    @SerialName("pending")
    Pending,

    // The migration is in progress.
    @SerialName("exporting")
    Exporting,

    // The migration finished successfully.
    @SerialName("exported")
    Exported,

    // The migration failed.
    @SerialName("failed")
    Failed
}