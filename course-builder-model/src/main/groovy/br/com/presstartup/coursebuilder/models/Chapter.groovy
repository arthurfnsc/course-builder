package br.com.presstartup.coursebuilder.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

/**
 * @author arthurfnsc
 *
 */
class Chapter {

    @Id
    private String id

    String title

    @DBRef
    private final List<Content> contents = []

    List<Content> getContents() {
        Collections.unmodifiableCollection(this.contents)
    }

    /**
     * @return
     */
    String getId() {
        this.id
    }
}
