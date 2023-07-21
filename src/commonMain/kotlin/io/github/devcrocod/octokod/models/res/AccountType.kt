package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable

@Serializable
public enum class AccountType {
    //  User account
    User,

    // Organization account
    Organization,

    // Bot account
    Bot,

    // Mannequin account - all user activity in the migrated repository (except Git commits)
    // 			is attributed to placeholder identities called mannequins.
    Mannequin
}