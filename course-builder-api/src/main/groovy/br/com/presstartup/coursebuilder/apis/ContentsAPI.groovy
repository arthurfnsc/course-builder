package br.com.presstartup.coursebuilder.apis

import org.springframework.context.annotation.Primary
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.multipart.MultipartFile

import br.com.presstartup.coursebuilder.swagger.api.ContentsApi
import br.com.presstartup.coursebuilder.swagger.model.CompleteContent
import io.swagger.annotations.Api
import io.swagger.annotations.ApiParam

@Api(value = "contents", description = "the contents API")
@Controller
@Primary
class ContentsAPI implements ContentsApi {

	@Override
	ResponseEntity<Boolean> contentsIdentifierItemPut(
			@ApiParam(value = "Content identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "Chapter origin identifier", required = true) @RequestParam(value = "chapterOrigin", required = true) final String chapterOrigin,
			@ApiParam(value = "Chapter target identifier", required = true) @RequestParam(value = "chapterTarget", required = true) final String chapterTarget) {
		// TODO Auto-generated method stub
	}

	@Override
	public ResponseEntity<CompleteContent> contentsIdentifierPut(
			@ApiParam(value = "Content identifier",required=true ) @PathVariable("identifier") final String identifier,
			@ApiParam(value = "file detail") @RequestPart("file") final MultipartFile content) {
		// TODO Auto-generated method stub
	}
}
