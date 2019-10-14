package com.varo.spring.service;

import java.util.List;
import java.util.Optional;

import com.varo.spring.model.Kitty;

public interface KittyService {

	public String getImage();

	public List<Kitty> list();

	public Optional<Kitty> get(int id);

	public Optional<Kitty> update(Kitty kitty);

	public Kitty add(Kitty kitty);

	public Optional<Kitty> delete(int id);

}
