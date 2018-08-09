package br.com.viavarejo.mp.bff.pamp.conf;

import feign.Logger;
import feign.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = { "br.com.viavarejo.mp.bff.pamp.core" })
public class FeignConfiguration {

    @Value("${feign.configuration.connectTimeoutMilis}")
    public int connectTimeoutMilis;

    @Value("${feign.configuration.readTimeoutMilis}")
    public int readTimeoutMilis;

    @Bean
    public feign.Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeoutMilis, readTimeoutMilis);
    }
}
