package com.sefaarslan;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="sefaarslan")
public class BlogProjectProperties {
	
	private boolean displayUsersWithPost = false;
	
	public boolean isDisplayUsersWithPost() {
		return displayUsersWithPost;
	}
	
	public void setDisplayOwnersWithPets(boolean displayUsersWithPost) {
		this.displayUsersWithPost = displayUsersWithPost;
	}
}
