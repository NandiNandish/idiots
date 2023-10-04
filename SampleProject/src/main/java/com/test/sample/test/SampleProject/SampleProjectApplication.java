package com.test.sample.test.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleProjectApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicaton) {
		return applicaton.sources(SampleProjectApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}
