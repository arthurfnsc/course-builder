package br.com.presstartup.coursebuilder.apis

import java.math.BigDecimal
import java.util.List

import org.springframework.context.annotation.Primary
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

import br.com.presstartup.coursebuilder.swagger.api.CoursesApi
import br.com.presstartup.coursebuilder.swagger.model.Chapter
import br.com.presstartup.coursebuilder.swagger.model.CompleteChapter
import br.com.presstartup.coursebuilder.swagger.model.CompleteCourse
import br.com.presstartup.coursebuilder.swagger.model.Course
import io.swagger.annotations.Api
import io.swagger.annotations.ApiParam

@Api(value = "courses", description = "the courses API")
@Controller
@Primary
class CoursesAPI implements CoursesApi {

	@Override
	ResponseEntity<List<CompleteCourse>> coursesGet(
			@ApiParam(value = "Order used to retrieve elements") @RequestParam(value = "orderBy", required = false) final String orderBy,
			@ApiParam(value = "Limit elements response") @RequestParam(value = "limit", required = false) final BigDecimal limit) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteCourse> coursesIdentifierChaptersItemsPut(
			@ApiParam(value = "Course identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Course chapters" ,required=true ) @RequestBody final List<Chapter> chapters) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteChapter> coursesIdentifierChaptersPost(
			@ApiParam(value = "Course identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Course chapter" ,required=true ) @RequestBody final Chapter chapter) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteCourse> coursesIdentifierGet(
			@ApiParam(value = "Course identifier",required=true ) @PathVariable("identifier") final String identifier) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteCourse> coursesIdentifierPut(
			@ApiParam(value = "Course identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Course" ,required=true ) @RequestBody final Course course) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteCourse> coursesPost(
			@ApiParam(value = "User course" ,required=true ) @RequestBody final Course course) {
		// TODO Auto-generated method stub
	}
}
