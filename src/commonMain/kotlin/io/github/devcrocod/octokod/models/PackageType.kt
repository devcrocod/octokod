package io.github.devcrocod.octokod.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class PackageType {
    // Npm repository packages
    @SerialName("npm")
    Npm,

    // Gradle registry packages
    @SerialName("maven")
    Maven,

    // RubyGems packages
    @SerialName("rubygems")
    RubyGems,

    // Docker container registry packages
    @SerialName("docker")
    Docker,

    // Nuget registry packages
    @SerialName("nuget")
    Nuget,

    // Container registry packages
    @SerialName("container")
    Container,
}