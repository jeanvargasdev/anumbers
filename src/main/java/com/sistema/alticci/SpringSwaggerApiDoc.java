package com.sistema.alticci;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringSwaggerApiDoc {
	
	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).select().
				apis(RequestHandlerSelectors.basePackage("com.sistema.alticci.resource")).
				paths(regex("/api.*")).
				build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Alticci API", "Number Generator System", "1.0", "Api Pulica", 
				new Contact("Jean Vargas", "https://profissionaisjava.com", "contato@profissionaisjava.com"), "License....", "License Apache...", 
				new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
