package io.github.devcrocod.octokod.models.req

import io.ktor.util.collections.*


// Base class for classes which represent query string parameters to certain API endpoints.
public abstract class RequestParameters {
    private val _propertiesMap: ConcurrentMap<String, List<PropertyParameter>> = ConcurrentMap()

    private class PropertyParameter() {
    }
}