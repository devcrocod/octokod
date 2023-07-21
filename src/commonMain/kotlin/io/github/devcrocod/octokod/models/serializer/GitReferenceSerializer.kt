package io.github.devcrocod.octokod.models.serializer

import io.github.devcrocod.octokod.models.res.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal object GitReferenceSerializer : KSerializer<GitRef> {
    override val descriptor: SerialDescriptor = GitReference.serializer().descriptor

    override fun serialize(encoder: Encoder, value: GitRef) {
        when (value) {
            is Commit -> encoder.encodeSerializableValue(Commit.serializer(), value)
            is GitHubCommit -> encoder.encodeSerializableValue(GitHubCommit.serializer(), value)
            is GitTag -> encoder.encodeSerializableValue(GitTag.serializer(), value)
            is Merge -> encoder.encodeSerializableValue(Merge.serializer(), value)
            is TagObject -> encoder.encodeSerializableValue(TagObject.serializer(), value)
            is GitReference -> encoder.encodeSerializableValue(GitReference.serializer(), value)
        }
    }

    override fun deserialize(decoder: Decoder): GitRef {
        val gitref = decoder.decodeSerializableValue(GitRef.serializer())
        return gitref
    }
}