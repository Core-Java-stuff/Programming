package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

	public static List<User> getUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(346, "basant", "IT", "user"));
		users.add(new User(346, "sasikant", "IT", "admin"));
		users.add(new User(346, "santosh", "IT", "user"));
		users.add(new User(348, "bijaya", "IT", "admin"));
		users.add(new User(348, "rakesh", "IT", "user"));
		return users;
	}

}
