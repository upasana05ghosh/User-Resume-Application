package com.userresume.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.userresume.entity.User;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	EntityManager entityManager;

	private static final Logger log = LoggerFactory.getLogger(UserDao.class);

	public User createUser(User user) {
		return entityManager.merge(user);
	}

	public User getUser(Long userId) {
		User user = entityManager.find(User.class, userId);
		log.info(user.toString());
		return user;
	}

	public void deleteUser(Long userId) {
		User user = entityManager.find(User.class, userId);
		entityManager.remove(user);
	}

	public User updateUser(User input) {
		return entityManager.merge(input);
	}

	public List<User> getAllUser() {
		TypedQuery<User> namedQuery = entityManager
				.createNamedQuery("get_all_user", User.class);
		return namedQuery.getResultList();
	}

}
