package com.sjgm.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	private long id;
	private String name;
	private String dept;
	private String role;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(long id, String name, String dept, String role) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.role = role;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", dept=" + dept
				+ ", role=" + role + "]";
	}
}

