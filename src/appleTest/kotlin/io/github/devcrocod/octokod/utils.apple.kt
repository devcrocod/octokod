package io.github.devcrocod.octokod

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.refTo
import kotlinx.cinterop.toKString
import platform.posix.fclose
import platform.posix.fgets
import platform.posix.fopen

@OptIn(ExperimentalForeignApi::class)
actual fun loadResource(resourceName: String): String? {
    val path = "src/commonTest/resources/$resourceName"
    println(fopen(path, "r"))
    val file = fopen(path, "r")
        ?: throw Exception("Cannot open input file $path")

    try {
        val buffer = ByteArray(4096)
        var result = ""

        while (true) {
            val nextLine = fgets(buffer.refTo(0), buffer.size, file)?.toKString() ?: break
            result += nextLine
        }
        return result
    } finally {
        fclose(file)
    }
}