package com.sjgm.question;

//This Extends make sense for inheritance
public class B extends A {
	@Override
	public void method() {
		System.out.println("Sub method");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Aggregation(tightly coupled)
		B b = new B();
		// Composition and Runtime polymorphisim
		A a = new B();// (Loosely coupled)
	}
}
