package com.sjgm.question;

import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

class UserSrv {
	public static void main(String[] args) {
		Map<Integer, String> map = new IdentityHashMap<>();
		List<Employee> employees = UserDB.getUsers();
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.getId() == e2.getId()) {
					return e1.getRole().compareTo(e2.getRole());

				} else {
					return e1.getId() - e2.getId();
				}
			}
		});
		for (Employee e : employees) {
			map.put(new Integer(e.getId()), e.getRole());
		}
		System.out.println(map);
	}

}
