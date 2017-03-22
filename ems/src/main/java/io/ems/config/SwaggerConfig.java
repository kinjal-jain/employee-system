package io.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())
				.useDefaultResponseMessages(false);
	}
	
	private ApiInfo apiInfo(){
		Contact contact = new Contact("Kinjal", "https://ufl.edu", "jain.kinjalkj@gmail.com");
		ApiInfo info = new ApiInfo("Employee Management System", "An employee management system is a web application that is used to Manage employees, update database, get search results based on the API's created", "1.0.0", "TnC", contact, "MIT", "https://opensource.org/licenses/MIT");
		return info;
	}
}
