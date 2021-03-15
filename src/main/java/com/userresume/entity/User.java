package com.userresume.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "t_user")
@NamedQuery(name = "get_all_user", query = "select u from User u")
public class User implements Serializable{

	private static final long serialVersionUID = 4222140946093348844L;

	@Id
	@GeneratedValue
	private long userId;
	private String userName;
	private String address;
	private String email;
	private String password;
	private Boolean isAdmin;

	public User() {

	}
	public User(String userName, String address, String email,
			String password, Boolean isAdmin) {
		super();
		this.userName = userName;
		this.address = address;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public User(long userId, String userName, String address,
			String email, String password, Boolean isAdmin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
