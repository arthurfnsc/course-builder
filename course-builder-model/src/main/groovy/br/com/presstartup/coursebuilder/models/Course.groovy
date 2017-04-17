package br.com.presstartup.coursebuilder.models

import java.time.LocalDate

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

class Course {

	@Id
	private String id

	@CreatedDate
	private LocalDate createdDate;

	BigDecimal duration
	BigDecimal price

	String description
	String name
	String subtitle

	@DBRef
	private List<Chapter> chapters = new ArrayList<>()

	Course() {
		this.createdDate = LocalDate.now()
	}

	boolean addChapter(final Chapter chapter) {
		this.chapters.add(chapter)
	}

	List<Chapter> getChapters() {
		this.chapters;
	}

	LocalDate getCreatedDate() {
		return this.createdDate;
	}

	String getId() {
		return this.id;
	}
}
