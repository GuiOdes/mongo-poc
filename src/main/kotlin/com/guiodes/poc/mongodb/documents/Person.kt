package com.guiodes.poc.mongodb.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("Person")
class Person(
    @Id
    val id: UUID = UUID.randomUUID(),
    val name: String
) {
    override fun toString(): String {
        return "Person(id=$id, name='$name')"
    }
}
