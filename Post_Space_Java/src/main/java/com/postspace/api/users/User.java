package com.postspace.api.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer usersid;
	private String username;
	private String password;
	
	public User() {}
	
	public User(int usersid, String username, String password) {
		this.password=password;
		this.username=username;
		this.usersid=usersid;
	}

	public Integer getUsersid() {
		return usersid;
	}

	public void setUsersid(Integer usersid) {
		this.usersid = usersid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [usersid=" + usersid + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
