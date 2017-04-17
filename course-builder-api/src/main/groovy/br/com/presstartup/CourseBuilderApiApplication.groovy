package br.com.presstartup

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.ExitCodeGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

import springfox.documentation.swagger2.annotations.EnableSwagger2

@ComponentScan("br.com.presstartup")
@EnableSwagger2
@SpringBootApplication
class CourseBuilderApiApplication implements CommandLineRunner {

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}
	}

	static void main(String[] args) {
		SpringApplication.run CourseBuilderApiApplication, args
	}

	@Override
	public void run(String... args) throws Exception {
		if ((args.length > 0) && args[0].equals("exitcode")) {
            throw new ExitException();
		}
	}
}
