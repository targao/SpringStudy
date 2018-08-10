package br.com.demo.project.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "br.com.demo.project.core" })
@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
public class ModuleConfiguration { }