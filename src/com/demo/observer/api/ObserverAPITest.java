package com.demo.observer.api;

public class ObserverAPITest {

	public void flow(int number) {
		ObservableValue ov = new ObservableValue();
		TestObserver observer = new TestObserver(ov);
		ov.addObserver(observer);
		ov.setValue(number);
	}

	public static void main(String[] args) {
		ObserverAPITest observerAPITest = new ObserverAPITest();
		observerAPITest.flow(6000);
	}
}
