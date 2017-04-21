package br.com.presstartup

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.ExitCodeGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * @author arthurfnsc
 *
 */
@ComponentScan('br.com.presstartup')
@SpringBootApplication
class CourseBuilderModelApplication implements CommandLineRunner {

    /**
     * @author arthurfnsc
     *
     */
    class ExitException extends RuntimeException implements ExitCodeGenerator {

        private static final long serialVersionUID = 1L

        final int exitCode = 10
    }

    /**
     * @param args
     */
    static void main(String[] args) {
        SpringApplication.run CourseBuilderModelApplication, args
    }

    /* (non-Javadoc)
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
     */
    @Override
    void run(String... args) throws Exception {
        if ((args.length > 0) && args[0] == ('exitcode')) {
            throw new ExitException()
        }
    }
}
