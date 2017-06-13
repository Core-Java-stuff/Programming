package com.demo.observer.api;

import java.util.Observable;

public class ObservableValue extends Observable {

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers();
	}

}
