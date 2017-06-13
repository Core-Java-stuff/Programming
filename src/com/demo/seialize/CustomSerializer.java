package com.demo.seialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sun.xml.internal.bind.api.AccessorException;

public class CustomSerializer {

	@SuppressWarnings("resource")
	public void serialize(Employee e) throws IOException,
			ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Serialize original Object");
		System.out.println("De-Serialize original Object :" + readStream());
		try {
			e.validateObject();
		} catch (AccessorException e1) {
			System.out.println(e1.getLocalizedMessage());
		}
	}

	@SuppressWarnings("resource")
	public Employee readStream() throws IOException, ClassNotFoundException {
		Employee e = null;
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		e = (Employee) ois.readObject();
		return e;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		CustomSerializer serializer = new CustomSerializer();
		/**
		 * This below object will not be Serialize and DeSerialize as i override
		 * 2 method in Employee class i.e writeReplace() and readResolve()
		 */
		serializer.serialize(new Employee(111, "Santosh"));
	}
}
