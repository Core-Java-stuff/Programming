package com.create.custom.annot;

import java.lang.reflect.Method;

public class ReverseString {

	@Reverse(value = "Basanta")
	public  void reverseStr() throws NoSuchMethodException,
			SecurityException {
		Class<? extends ReverseString> cls = this.getClass();
		Method method = cls.getClass().getMethod("reverseStr");
		Reverse reverse = method.getAnnotation(Reverse.class);
		System.out.println("Reverse value :" + reverse.value());
	}
}
