package com.dugu.acc.dev.java8.features.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrencyModificationSample {

	public static List<Employee> getList() {
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add(new Employee(i, "user:" + i));
		}
		return list;
	}

	/*
	 * Here if i will run below method then i will get
	 * ConcurrentModificationException as per Java 7
	 */
	public static void removeByJava7(int id) {
		List<Employee> list = getList();
		for (Employee e : list) {
			if (e.getId() == id) {
				list.remove(e);
			}
		}
		System.out.println(list);
	}

	/*
	 * Here if i will run below method then i will not get
	 * ConcurrentModificationException as per Java 7 cause use Concurrent
	 * package
	 */

	public static void overcomeRemoveByJava7(int id) {
		List<Employee> list = new CopyOnWriteArrayList<>(getList());
		for (Employee e : list) {
			if (e.getId() == id) {
				list.remove(e);
			}
		}
		System.out.println(list);
	}

	/*
	 * Then Find solution why in Java 8 iteration we are not getting any issue
	 * it working smoothly
	 */
	public static void removeByJava8(int id) {
		List<Employee> list = getList();
		list.removeIf(e -> e.getId() == id);
		System.out.println(list);
	}

	public static void main(String[] args) {
		removeByJava8(10);
		// removeByJava7(10);
		overcomeRemoveByJava7(10);
	}
}
