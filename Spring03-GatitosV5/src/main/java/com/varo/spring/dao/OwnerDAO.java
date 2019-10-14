package com.varo.spring.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.varo.spring.model.Kitty;
import com.varo.spring.model.Owner;

@Repository
public class OwnerDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public OwnerDAO() {

	}

	public Owner getOwnerById(int id) {
		return entityManager.find(Owner.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Owner> list() {

		String hql = "FROM Owner ORDER BY OWNER_ID";
		return (List<Owner>) entityManager.createQuery(hql).getResultList();
	}

	@Transactional
	public Owner add(Owner owner) {
		return entityManager.merge(owner);
	}

	@Transactional
	public Optional<Owner> update(Owner owner) {
		Owner currentOwner = getOwnerById(owner.getId());

		if (currentOwner != null)
			entityManager.merge(owner);

		return Optional.ofNullable(currentOwner);
	}

	@Transactional
	public Optional<Owner> delete(int id) {
		Owner currentOwner = getOwnerById(id);

		if (currentOwner != null)
			entityManager.remove(getOwnerById(id));

		return Optional.ofNullable(currentOwner);
	}

	@Transactional
	public Optional<Owner> get(int id) {
		return Optional.ofNullable(getOwnerById(id));
	}
}
