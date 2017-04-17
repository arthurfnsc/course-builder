package br.com.presstartup.coursebuilder.repositories

import org.springframework.data.mongodb.repository.MongoRepository

import br.com.presstartup.coursebuilder.models.Content

interface ContentRepository extends MongoRepository<Content, String> {

}
