package com.varo.spring.dao;

import java.util.List;

import com.varo.spring.model.Kitty;

public interface KittyDAO {
	public List<Kitty> list();
	
	public Kitty get(int id);
	
	public void update(Kitty kitty);
	public void add(Kitty kitty);
	
	public void delete(int id);
}