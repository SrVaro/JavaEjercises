package com.varo.spring.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service("kittyService")
public class KittyServiceImpl implements KittyService {

	@Override
	public void getImage(RestTemplate restTemplate, Model model) {
		try {

			final String uri = "https://api.thecatapi.com/v1/images/search";

			String response = restTemplate.getForObject(uri, String.class);

			ObjectMapper mapper = new ObjectMapper();

			JsonNode root = mapper.readTree(response.substring(1, response.length() - 1));

			model.addAttribute("img", root.get("url").asText());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
