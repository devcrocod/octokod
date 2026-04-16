rootProject.name = "octokod"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":octokod-core")
include(":octokod-client-okhttp")
include(":octokod-client-ktor")
