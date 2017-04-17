package br.com.presstartup.coursebuilder.models

import java.util.List

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

class Chapter {

	@Id
	private String id

	String title

	@DBRef
	List<Content> contents = new ArrayList<>()

	List<Content> getContents() {
		Collections.unmodifiableCollection(this.contents);
	}

	String getId() {
		return this.id;
	}
}
