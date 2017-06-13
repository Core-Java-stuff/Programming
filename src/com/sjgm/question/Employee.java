package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String role;

	public Employee(int id, String role) {
		this.id = id;
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return id + ", " + role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

}

class UserDB {
	public static List<Employee> getUsers() {
		List<Employee> users = new ArrayList<>();
		users.add(new Employee(1, "user"));
		users.add(new Employee(1, "admin"));
		users.add(new Employee(2, "admin"));
		return users;
	}
}
