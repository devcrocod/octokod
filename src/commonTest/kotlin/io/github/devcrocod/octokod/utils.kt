package io.github.devcrocod.octokod

import io.github.devcrocod.octokod.models.res.LocalDateTimeSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonNamingStrategy
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual

/**
 * Loads a file from resources with the given [resourceName].
 *
 * @param resourceName the name of the file to load
 * @return the content of the loaded resource as a [String], or `null` if the resource could not be loaded
 */
expect fun loadResource(resourceName: String): String?

/**
 * JSON configuration used for serializing and deserializing JSON data.
 *
 * - **prettyPrint** - Flag indicating whether the JSON output should be formatted with indentation and line breaks.
 * - **isLenient** - Flag indicating whether the JSON parser should be lenient when encountering unknown JSON properties.
 * - **namingStrategy** - The naming strategy used for JSON property names.
 * - **encodeDefaults** - Flag indicating whether default property values should be included in the serialized output.
 * - **explicitNulls** - Flag indicating whether `null` values should be explicitly included in the serialized output.
 * - **allowSpecialFloatingPointValues** - Flag indicating whether special floating point values like NaN and infinity are allowed.
 * - **serializersModule** - The module containing custom serializers to be used during serialization and deserialization
 */
@OptIn(ExperimentalSerializationApi::class)
internal val jsonConfig = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
    namingStrategy = JsonNamingStrategy.SnakeCase
    encodeDefaults = true
    explicitNulls = true
    allowSpecialFloatingPointValues = true
    serializersModule = SerializersModule {
        contextual(LocalDateTimeSerializer)
    }
}