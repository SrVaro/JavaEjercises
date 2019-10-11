package com.varo.spring.service;

import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

public interface KittyService {

	public void getImage(RestTemplate restTemplate, Model model);
	
}
