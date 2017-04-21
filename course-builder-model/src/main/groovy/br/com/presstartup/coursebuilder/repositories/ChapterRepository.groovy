package br.com.presstartup.coursebuilder.repositories

import org.springframework.data.mongodb.repository.MongoRepository

import br.com.presstartup.coursebuilder.models.Chapter

/**
 * @author arthurfnsc
 *
 */
interface ChapterRepository extends MongoRepository<Chapter, String> {

}
