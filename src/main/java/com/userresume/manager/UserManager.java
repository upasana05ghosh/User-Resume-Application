package com.userresume.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.userresume.dao.UserDao;
import com.userresume.entity.User;

@Component
public class UserManager {

	@Autowired
	UserDao userDao;

	public User createUser(User user) {
		return userDao.createUser(user);
	}

	public User getUser(Long userId) {
		return userDao.getUser(userId);
	}

	public void deleteUser(Long userId) {
		userDao.deleteUser(userId);
	}

	public User updateUser(User input) {
		return userDao.updateUser(input);
	}

	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
