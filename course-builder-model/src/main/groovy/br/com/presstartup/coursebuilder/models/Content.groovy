package br.com.presstartup.coursebuilder.models

import org.springframework.data.annotation.Id

/**
 * @author arthurfnsc
 *
 */
class Content {

    @Id
    private String id

    String name
    String media

    String getId() {
        this.id
    }
}
