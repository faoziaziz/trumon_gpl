package tech.faozi.trumon.config;

/*
 * 	Author 		: Aziz Amerul Faozi
 * 	Description : This code used to config swagger 2 on spring
 * */


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("tech.faozi.trumon.controller"))
				.paths(PathSelectors.regex("/.*"))
				.build().apiInfo(apiEndPointsInfo());
	}

	private ApiInfo apiEndPointsInfo() {

		return new ApiInfoBuilder().title("Trumon API")
				.description("Just api to give provide ")
				.contact(new Contact("Aziz Amerul Faozi", "http://blog.faozi.tech", "admin@labseni.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("0.0.1")
				.build();
	}
}