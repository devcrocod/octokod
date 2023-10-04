package io.github.devcrocod.octokod.models

import io.github.devcrocod.octokod.jsonConfig
import io.github.devcrocod.octokod.models.res.User
import kotlinx.serialization.json.encodeToJsonElement
import io.github.devcrocod.octokod.loadResource
import kotlin.test.Test
import kotlin.test.assertEquals

class UsersModelsTests {
    @Test
    fun `test private user json`() {
        val strJson = loadResource("models/users/PrivateUser.json")
        val user = strJson?.let { jsonConfig.decodeFromString<User>(it) }

        assertEquals(jsonConfig.parseToJsonElement(strJson!!), jsonConfig.encodeToJsonElement(user))
        println(user)
    }

    @Test
    fun `test public user json`() {
        val strJson = loadResource("models/users/PublicUser.json")
        val user = strJson?.let { jsonConfig.decodeFromString<User>(it) }

        assertEquals(jsonConfig.parseToJsonElement(strJson!!), jsonConfig.encodeToJsonElement(user))
        println(user)
    }
}