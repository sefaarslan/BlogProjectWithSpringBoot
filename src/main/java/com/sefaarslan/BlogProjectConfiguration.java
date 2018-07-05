package com.sefaarslan;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogProjectConfiguration {
	@Autowired
	private BlogProjectProperties blogProjectProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Display users with posts :" +blogProjectProperties.isDisplayUsersWithPost());
	}
}
