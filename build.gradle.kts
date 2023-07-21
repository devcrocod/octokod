import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    kotlin("multiplatform") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
}


group = "io.github.devcrocod"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
kotlin {
    explicitApi()
    targetHierarchy.default()

    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    // linux
    linuxX64()

    // windows
    mingwX64()

    // ios
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    // macos
    macosX64()
    macosArm64()

    val ktor_version: String by project
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-core:$ktor_version")
                implementation("io.ktor:ktor-client-logging:$ktor_version")
                implementation("io.ktor:ktor-client-auth:$ktor_version")
                implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.ktor:ktor-client-mock:$ktor_version")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-okhttp:$ktor_version")
            }
        }
        val mingwX64Main by getting {
            dependencies {
                implementation("io.ktor:ktor-client-winhttp:$ktor_version")
            }
        }
        val linuxMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-cio:$ktor_version")
            }
        }
        val appleMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-darwin:$ktor_version")
            }
        }
    }
}
