package com.varo.spring.service;

import java.util.List;
import com.varo.spring.model.Kitty;

public interface KittyService {

	public String getImage();

	public List<Kitty> list();

	public Kitty get(int id);

	public void update(Kitty kitty);

	public void add(Kitty kitty);

	public void delete(int id);

}
