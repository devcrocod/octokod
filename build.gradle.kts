import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    kotlin("multiplatform") version "1.9.20-Beta2"
    kotlin("plugin.serialization") version "1.9.20-Beta2"
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
            useJUnit()
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

    val ktorVersion: String by project
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-logging:$ktorVersion")
                implementation("io.ktor:ktor-client-auth:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.ktor:ktor-client-mock:$ktorVersion")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
            }
        }
        val mingwX64Main by getting {
            dependencies {
                implementation("io.ktor:ktor-client-winhttp:$ktorVersion")
            }
        }
        val linuxMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-cio:$ktorVersion")
            }
        }
        val appleMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-darwin:$ktorVersion")
            }
        }
    }
}
