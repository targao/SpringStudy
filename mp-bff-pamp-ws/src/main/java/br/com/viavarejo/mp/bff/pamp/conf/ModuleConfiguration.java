package br.com.viavarejo.mp.bff.pamp.conf;

import br.com.viavarejo.mpcomum.lib.seguranca.EnableSegurancaViaVarejo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSegurancaViaVarejo
@ComponentScan(basePackages = { "br.com.viavarejo.mp.bff.pamp.core" })
@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
public class ModuleConfiguration { }