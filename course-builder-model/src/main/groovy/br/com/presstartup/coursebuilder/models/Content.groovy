package br.com.presstartup.coursebuilder.models

import org.springframework.data.annotation.Id

class Content {

	@Id
	private String id

	String name
	String media
}
