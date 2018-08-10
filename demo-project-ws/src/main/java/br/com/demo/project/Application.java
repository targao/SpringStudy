package br.com.demo.project;

import br.com.demo.project.config.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Application {

    public static void main(String... args) {
        new SpringApplicationBuilder(
                Application.class,
                ModuleConfiguration.class,
                SwaggerConfiguration.class
        ).run(args);
    }

}