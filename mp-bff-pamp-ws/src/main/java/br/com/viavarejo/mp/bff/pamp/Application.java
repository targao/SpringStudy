package br.com.viavarejo.mp.bff.pamp;

import br.com.viavarejo.mp.bff.pamp.conf.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Application {

    public static void main(String... args) {
        new SpringApplicationBuilder(
                Application.class,
                EurekaClientConfiguration.class,
                FeignConfiguration.class,
                JacksonConfiguration.class,
                ModuleConfiguration.class,
                SwaggerConfiguration.class
        ).run(args);
    }

}