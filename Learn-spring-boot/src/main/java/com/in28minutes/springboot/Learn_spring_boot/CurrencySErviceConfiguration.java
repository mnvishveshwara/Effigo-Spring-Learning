package com.in28minutes.springboot.Learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencySErviceConfiguration {

	private String url;
	private String username;
	private String key;

	
//	public CurrencySErviceConfiguration(String url, String username, String key) {
//		super();
//		this.url = url;
//		this.username = username;
//		this.key = key;
//	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUsername() {
		return username;
	}

	public String getKey() {
		return key;
	}

}
