package com.guiodes.poc.mongodb.service

import com.guiodes.poc.mongodb.documents.Person
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class PersonService(
    private val mongoTemplate: MongoTemplate
) {

    init {
        Logger.getLogger("PersonService").info(mongoTemplate.findAll(Person::class.java).toString())
    }

    fun save(person: Person): Person {
        return mongoTemplate.save(person)
    }

    fun findAll(): List<Person> {
        return mongoTemplate.findAll(Person::class.java)
    }

    fun findById(id: String): Person? {
        return mongoTemplate.findById(id, Person::class.java)
    }

    fun deleteById(id: String) {
        mongoTemplate.remove(findById(id)!!)
    }

    fun update(person: Person): Person {
        return mongoTemplate.save(person)
    }
}