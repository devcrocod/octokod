package io.github.devcrocod.octokod.models.serializer

import io.github.devcrocod.octokod.models.res.Author
import io.github.devcrocod.octokod.models.res.RepositoryContributor
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal object AuthorSerializer : KSerializer<Author> {
    override val descriptor: SerialDescriptor = Author.serializer().descriptor

    override fun deserialize(decoder: Decoder): Author {
        return decoder.decodeSerializableValue(Author.serializer())
    }

    override fun serialize(encoder: Encoder, value: Author) {
        when (value) {
            is RepositoryContributor -> encoder.encodeSerializableValue(RepositoryContributor.serializer(), value)
            else -> encoder.encodeSerializableValue(Author.serializer(), value)
        }
    }
}

internal object RepositoryContributorSerializer : KSerializer<RepositoryContributor> {
    override val descriptor: SerialDescriptor = RepositoryContributor.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryContributor {
        return decoder.decodeSerializableValue(RepositoryContributor.serializer())
    }

    override fun serialize(encoder: Encoder, value: RepositoryContributor) {
        encoder.encodeSerializableValue(RepositoryContributor.serializer(), value)
    }
}