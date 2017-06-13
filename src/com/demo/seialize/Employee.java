package com.demo.seialize;

import java.io.InvalidObjectException;
import java.io.Serializable;

import com.sun.xml.internal.bind.api.AccessorException;

public class Employee implements Serializable {
	private static final long serialVersionUID = 7748890737561274086L;

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return " id=" + id + ", name=" + name + "";
	}

	/**
	 * It will not Serialize Original Object which you Serialize Runtime , i
	 * used this method and modified employee object data so it will serialize
	 * now below object instead of original one
	 */
	private Object writeReplace() {
		return new Employee(143, "Not Original Serilaize");
	}

	/**
	 * It will not DeSerialize Original Object which you DeSerialize From
	 * Serialized file , i used this method and modified DeSerialize employee
	 * object data so it will DeSerialize now below object instead of original
	 * one
	 */
	public Object readResolve() {
		return new Employee(768, "Not Original Deserialize");
	}

	/**
	 * This method will help us to validate object before Serialize
	 * 
	 * @throws AccessorException
	 */
	public void validateObject() throws InvalidObjectException,
			AccessorException {
		System.out.println("Validating object...");
		if (this.id == 111) {
			System.out.println("Validated.");
		} else {
			throw new AccessorException("Invalid ID :" + this.id
					+ " can't be Serialize");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
