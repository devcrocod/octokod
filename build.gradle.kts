
plugins {
    id("octokod.dokka")
    alias(libs.plugins.korro)
    alias(libs.plugins.binary.compatibility.validator)
}

dependencies {
    dokka(project(":octokod-core"))
    dokka(project(":octokod-client-okhttp"))
    dokka(project(":octokod-client-ktor"))
}

val octokodVersion: String = libs.versions.octokod.get()

allprojects {
    group = "id.github.devcrocod"
    version = octokodVersion
}

apiValidation {
    @OptIn(kotlinx.validation.ExperimentalBCVApi::class)
    klib {
        enabled = true
    }
}

dokka {
    moduleName = "Octokod"

    dokkaPublications.html {
        includes.from("dokka/modules.md")
    }
}

korro {
    docs = fileTree(rootProject.rootDir) {
        include("README.md")
        include("octokod-*/Module.md")
        include("docs/**/*.md")
        include("dokka/modules.md")
    }

    samples = fileTree(project.projectDir) {
        include("octokod-*/src/commonTest/kotlin/io/github/devcrocod/octokod/**/samples/*.kt")
    }
}
