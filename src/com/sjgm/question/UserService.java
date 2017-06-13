package com.sjgm.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UserService {

	public static Map<Long, List<User>> mapUser() {
		Map<Long, List<User>> userMap = new HashMap<>();
		List<User> users = UserUtils.getUsers();
		Set<Long> ids = new TreeSet<>();
		List<User> userList = new ArrayList<>();
		for (User user : users) {
			ids.add(user.getId());
		}
		/*Using Java 8
		 * for (long i : ids) { userList = users.stream().filter(u -> i ==
		 * u.getId()) .collect(Collectors.toList()); userMap.put(i, userList); }
		 */

		for (long i : ids) {
			List<User> lUser=new ArrayList<User>();
			for (User u : users) {
				if (i == u.getId()) {
					lUser.add(u);
				}
			}
			userMap.put(i, lUser);
		}
		return userMap;
	}

	public static void main(String[] args) {
		System.out.println(mapUser());
	}
}
