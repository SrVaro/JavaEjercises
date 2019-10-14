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
import com.varo.spring.dao.OwnerDAO;
import com.varo.spring.model.Kitty;
import com.varo.spring.model.Owner;

@Service
public class OwnerService {

	@Autowired
	private OwnerDAO ownerDao;

	public List<Owner> list() {
		return ownerDao.list();
	}

	public Optional<Owner> get(int id) {
		return ownerDao.get(id);
	}

	public Optional<Owner> update(Owner owner) {
		return ownerDao.update(owner);
	}

	public Owner add(Owner owner) {
		return ownerDao.add(owner);
	}

	public Optional<Owner> delete(int id) {
		return ownerDao.delete(id);
	}
}
