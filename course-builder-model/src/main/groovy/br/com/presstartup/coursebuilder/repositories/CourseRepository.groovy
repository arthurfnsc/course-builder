package br.com.presstartup.coursebuilder.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

import br.com.presstartup.coursebuilder.models.Course

/**
 * @author arthurfnsc
 *
 */
@Repository
interface CourseRepository extends MongoRepository<Course, String> {

}
