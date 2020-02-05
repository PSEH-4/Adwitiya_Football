package com.football.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestRequestClient {
	
	
	public String getResponse(final String url){
		
		RestTemplate restTemplate = new RestTemplate();
		
	    return restTemplate.getForObject(url, String.class);
	}

}
