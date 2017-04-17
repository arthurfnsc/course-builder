package br.com.presstartup.coursebuilder.repositories

import org.springframework.data.mongodb.repository.MongoRepository

import br.com.presstartup.coursebuilder.models.Chapter

interface ChapterRepository extends MongoRepository<Chapter, String> {

}
