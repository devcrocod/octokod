package io.github.devcrocod.octokod

actual fun loadResource(resourceName: String): String? =
    ClassLoader.getSystemClassLoader().getResource(resourceName)?.readText()
