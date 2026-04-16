plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = true)

    if (project.providers.gradleProperty("signing.keyId").isPresent ||
        project.providers.environmentVariable("ORG_GRADLE_PROJECT_signingInMemoryKey").isPresent
    ) {
        signAllPublications()
    }

    coordinates(group.toString(), project.name, version.toString())

    pom {
        name = project.name
        description = "GitHub API client Kotlin Multiplatform library"
        inceptionYear = "2026"
        url = "https://github.com/devcrocod/octokod"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "repo"
            }
        }
        developers {
            developer {
                id = "devcrocod"
                name = "Pavel Gorgulov"
                url = "https://github.com/devcrocod"
            }
        }
        scm {
            url = "https://github.com/devcrocod/octokod"
            connection = "scm:git:git://github.com/devcrocod/octokod.git"
            developerConnection = "scm:git:ssh://github.com/devcrocod/octokod.git"
        }
    }
}
