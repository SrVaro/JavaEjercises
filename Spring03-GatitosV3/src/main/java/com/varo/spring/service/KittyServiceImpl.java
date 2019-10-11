package com.varo.spring.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.varo.spring.dao.KittyDAO;
import com.varo.spring.model.Kitty;

@Service("kittyService")
public class KittyServiceImpl implements KittyService {

	@Autowired
	private KittyDAO kittyDao;

	@Override
	public String getImage() {

		String photo = "";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		headers.add("x-api-key", "69521f5d-1f9a-4e1c-9f47-2cdc5caea9dc");

		HttpEntity<String> entity = new HttpEntity<>("body", headers);

		ResponseEntity<String> response = restTemplate.exchange("https://api.thecatapi.com/v1/images/search",
				HttpMethod.GET, entity, String.class);

		ObjectMapper mapper = new ObjectMapper();

		try {

			JsonNode root = mapper.readTree(response.getBody().substring(1, response.getBody().length() - 1));

			photo = root.get("url").asText();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return photo;
	}

	@Override
	public List<Kitty> list() {
		return kittyDao.list();
	}

	@Override
	public Optional<Kitty> get(int id) {
		return kittyDao.get(id);
	}

	@Override
	public Optional<Kitty> update(Kitty kitty) {
		return kittyDao.update(kitty);
	}

	@Override
	public Kitty add(Kitty kitty) {
		return kittyDao.add(kitty);
	}

	@Override
	public Optional<Kitty> delete(int id) {
		return kittyDao.delete(id);
	}
}
