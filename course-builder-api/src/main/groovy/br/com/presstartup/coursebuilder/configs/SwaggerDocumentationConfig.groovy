package br.com.presstartup.coursebuilder.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.models.Contact
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SwaggerDocumentationConfig {

	ApiInfo apiInfo() {

		def description = new StringBuilder("Online course creators are always looking for the 'best' tool to build ")
		description.append "their courses, something that is extremely powerful, content-rich, customizable and yet "
		description.append "very simple to use. We at Thinkific are very proud of the solution that we've built, "
		description.append "but we are very curious about others’ take on this challenge so we want to see what "
		description.append "they would visualize."

		return new ApiInfoBuilder()
			.title("Course Builder API")
			.description(description.toString())
			.license("")
			.licenseUrl("")
			.termsOfServiceUrl("")
			.version("1.1.0")
			.build();
	}

	@Bean
	Docket customImplementation(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.presstartup.coursebuilder.apis"))
				.build()
				.apiInfo(apiInfo());
	}
}
