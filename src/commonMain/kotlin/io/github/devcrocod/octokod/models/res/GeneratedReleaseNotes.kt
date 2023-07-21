package io.github.devcrocod.octokod.models.res

import kotlinx.serialization.Serializable


// Used to retrieve generated release notes.

// API: https://docs.github.com/rest/releases/releases#generate-release-notes-content-for-a-release
// The generated release notes are not saved anywhere.
// They are intended to be generated and used when creating a new release.
@Serializable
public data class GeneratedReleaseNotes(val name: String, val body: String)