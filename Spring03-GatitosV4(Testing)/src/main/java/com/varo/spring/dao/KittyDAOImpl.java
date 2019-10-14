package com.varo.spring.dao;

import java.util.List;
import java.util.Optional;

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

	public Kitty getKittyById(int id) {
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
	public Kitty add(Kitty kitty) {
		return entityManager.merge(kitty);
	}

	@Override
	@Transactional
	public Optional<Kitty> update(Kitty kitty) {
		Kitty currentKitty = getKittyById(kitty.getId());

		if (currentKitty != null)
			entityManager.merge(kitty);

		return Optional.ofNullable(currentKitty);
	}

	@Override
	@Transactional
	public Optional<Kitty> delete(int id) {
		Kitty currentKitty = getKittyById(id);

		if (currentKitty != null)
			entityManager.remove(getKittyById(id));

		return Optional.ofNullable(currentKitty);
	}

	@Override
	@Transactional
	public Optional<Kitty> get(int id) {
		return Optional.ofNullable(getKittyById(id));
	}
}