package br.com.presstartup.coursebuilder.apis

import org.springframework.context.annotation.Primary
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.multipart.MultipartFile

import br.com.presstartup.coursebuilder.swagger.api.ChaptersApi
import br.com.presstartup.coursebuilder.swagger.model.Chapter
import br.com.presstartup.coursebuilder.swagger.model.CompleteChapter
import br.com.presstartup.coursebuilder.swagger.model.CompleteContent
import io.swagger.annotations.Api
import io.swagger.annotations.ApiParam

@Api(value = "chapters", description = "the chapters API")
@Controller
@Primary
class ChaptersAPI implements ChaptersApi {

	@Override
	ResponseEntity<CompleteChapter> chaptersIdentifierContentsItemsPut(
			@ApiParam(value = "Chapter identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Chapter contents" ,required=true ) @RequestBody final List<CompleteContent> contents) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteContent> chaptersIdentifierContentsPost(
			@ApiParam(value = "Chapter identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "file detail") @RequestPart("file") final MultipartFile content) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteChapter> chaptersIdentifierGet(
			@ApiParam(value = "Chapter identifier",required=true ) @PathVariable("identifier") final String identifier) {
		// TODO Auto-generated method stub
	}

	@Override
	ResponseEntity<CompleteChapter> chaptersIdentifierPut(
			@ApiParam(value = "Chapter identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Course chapter" ,required=true ) @RequestBody final Chapter chapter) {
		// TODO Auto-generated method stub
	}
}
