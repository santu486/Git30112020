package com.san;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackages = {"com"})
@EnableJpaRepositories(basePackages = {"com"})
@ComponentScan(basePackages = {"com"})
@EnableAutoConfiguration
@Configuration
@EnableSwagger2
public class TutorialApp {

	public static void main(String[] args) {
		System.out.print("started 1");
		SpringApplication.run(TutorialApp.class, args);
		System.out.print("started 2");
	}

}
