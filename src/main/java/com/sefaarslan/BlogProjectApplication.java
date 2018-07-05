package com.sefaarslan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(value=BlogProjectProperties.class)
@ServletComponentScan
public class BlogProjectApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BlogProjectApplication.class, args);
	}
}
