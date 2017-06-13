package com.dugu.acc.dev.java8.features.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Java8ForEachSample {

	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = getList();

		// Approach : 1 using Anonymous inner class
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Value using annonymous Inner class :" + t);
			}
		});

		System.out
				.println("******************************************************");

		// Approach : 2 using inner class
		list.forEach(new MyListConsumer());

		// Implement Streaming API
		// ===========================
		// sequential stream
		Stream<Integer> sequentialStream = list.stream();
		System.out.println("SEQUENCE :" + sequentialStream);
		// parallel stream
		Stream<Integer> parallelStream = list.parallelStream();
		System.out.println("PARALLEL :" + parallelStream);
		
		//find high number
		
		
		
	}

	private static class MyListConsumer implements Consumer<Integer> {

		@Override
		public void accept(Integer t) {
			System.out.println("Value using Inner class :" + t);

		}

	}
}
