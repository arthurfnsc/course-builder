package br.com.presstartup.coursebuilder.apis

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @author arthurfnsc
 *
 */
@Controller
class HomeAPI {

    /**
     * @return
     */
    @RequestMapping(value = '/')
    String index() {
        'redirect:swagger-ui.html'
    }
}
