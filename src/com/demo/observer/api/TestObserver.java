package com.demo.observer.api;

import java.util.Observable;
import java.util.Observer;

public class TestObserver implements Observer {

	private ObservableValue ov = null;

	public TestObserver(ObservableValue ov) {
		this.ov = ov;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == ov) {
			System.out.println("Current Value :" + ov.getValue());
		}
	}

}
