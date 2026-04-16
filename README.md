# Octokod

Kotlin Multiplatform GitHub API Client

## Basic Usage
```kotlin
// Create a GitHub client
val github = Octokod {
    token = "your-github-token"  // Optional: for authenticated requests
    baseUrl = "https://api.github.com"  // Optional: defaults to GitHub API
}

// Make API requests
suspend fun example() {
    // Get authenticated user information
    val user = github.get("user")

    // Get repository information
    val repo = github.get("repos/owner/repo")

    // Create an issue
    val response = github.post("repos/owner/repo/issues") {
        body = """
            {
                "title": "Issue title",
                "body": "Issue description"
            }
        """.trimIndent()
    }
}
```

## Setup
1. Add the Maven Central repository to your project:
```kotlin
repositories {
    mavenCentral()
}
```

2. Add the dependency to your project:
```kotlin
dependencies {
    implementation("io.github.devcrocod:octokod:$latest_version")
}
```

3. Configure the client with your GitHub credentials and start making API requests.

## Supported Platforms
- JVM
- iOS (X64, Arm64, Simulator)
- macOS (X64, Arm64)
- Linux (X64)
- Windows (X64)

## Contributing
Contributions are welcome! Here's how you can help:
- Report bugs or request features by creating issues
- Submit pull requests for bug fixes or new features
- Improve documentation
- Share your feedback and suggestions

Please ensure your pull requests adhere to the existing code style and include appropriate tests.

## License
This project is licensed under the Apache License 2.0 — see below for details:
