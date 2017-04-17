package br.com.presstartup.coursebuilder.apis

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeAPI {

	@RequestMapping(value = "/")
	String index() {
		return "redirect:swagger-ui.html";
	}
}
