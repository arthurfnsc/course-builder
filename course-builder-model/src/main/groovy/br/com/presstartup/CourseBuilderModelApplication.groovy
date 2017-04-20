package br.com.presstartup

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.ExitCodeGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan("br.com.presstartup")
@SpringBootApplication
class CourseBuilderModelApplication implements CommandLineRunner {

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}
	}

	static void main(String[] args) {
		SpringApplication.run CourseBuilderModelApplication, args
	}

	@Override
	public void run(String... args) throws Exception {
		if ((args.length > 0) && args[0].equals("exitcode")) {
            throw new ExitException();
		}
	}
}
