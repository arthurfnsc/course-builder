package br.com.presstartup.coursebuilder.models

import java.time.LocalDate

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

/**
 * @author arthurfnsc
 *
 */
class Course {

    @Id
    private String id

    @CreatedDate
    private final LocalDate createdDate

    BigDecimal duration
    BigDecimal price

    String description
    String name
    String subtitle

    @DBRef
    private final List<Chapter> chapters = []

    Course() {
        this.createdDate = LocalDate.now()
    }

    boolean addChapter(final Chapter chapter) {
        this.chapters.add(chapter)
    }

    List<Chapter> getChapters() {
        this.chapters
    }

    LocalDate getCreatedDate() {
        this.createdDate
    }

    String getId() {
        this.id
    }
}
