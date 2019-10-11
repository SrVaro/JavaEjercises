package com.varo.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.varo.spring.model.Kitty;

@Repository
public class KittyDAOImpl implements KittyDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public KittyDAOImpl() {

	}

	public Kitty getUserById(int id) {
		return entityManager.find(Kitty.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Kitty> list() {

		String hql = "FROM Kitty ORDER BY KITTY_ID";
		return (List<Kitty>) entityManager.createQuery(hql).getResultList();
	}

	
	@Override
	@Transactional
	public void add(Kitty kitty) {
		System.out.println(kitty);
		entityManager.merge(kitty);
	}

	@Override
	public void update(Kitty kitty) {
		Kitty newKitty = getUserById(kitty.getId());

		newKitty.setName(kitty.getName());
		newKitty.setUrl(kitty.getUrl());

		entityManager.persist(kitty);
	}

	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getUserById(id));
	}

	@Override
	@Transactional
	public Kitty get(int id) {
		return entityManager.find(Kitty.class, id);
	}
}