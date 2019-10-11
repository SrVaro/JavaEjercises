package com.varo.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.varo.spring.service.KittyService;

@Controller("kittyController")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KittyController {

	@Autowired
	private KittyService kittyService;

	@GetMapping("/kitty")
	String getAvailableOperations(Model model, RestTemplate restTemplate) {

		kittyService.getImage(restTemplate, model);

		return "index";
	}

}