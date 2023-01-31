package com.healthcrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition
(info = @Info(
        title = "HealthCRAD Web Applicaion API",
        version = "2.0",
        description = "HealthCRAD Setup Module Documentation",
        license = @License(name = "Apache 2.0", url = "https://thinkweb.healthcrad.com/swagger-ui/index.html"),
        contact = @Contact(url = "https://www.healthcrad.com", name = "Om Shankar Sharma", email = "omshankarsharma456@gmail.com")
))
public class HealthCradBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCradBackendApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
			}
		};
	}
}
