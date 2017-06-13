package com.sjgm.question;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSample implements Callable<String> {
	/*
	 * Based on Generic which u will pass at class level method return type will
	 * be same i passed Callable<String> so return type of call is also String u
	 * can change based on your Requirement
	 */
	@Override
	public String call() throws Exception {
		System.out
				.println("This will print execute() call cause execute() method dont have return type ");
		return "Wao ! Method returning some dummy";
	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		/*
		 * newFixedThreadPool(2) i passed 2 here cause want to get 2 thread
		 * reference from POOL
		 */
		ExecutorService service = Executors.newFixedThreadPool(2);

		/*
		 * service.submit(task) will take my task and provide to my 2 thread
		 */
		Future<String> future = service.submit(new CallableSample());
		System.out.println(future.get());
		/*
		 * as its return type is void so we should prefer here Runnable insted
		 * of Callable if u want using ExecutorService Framework specially it
		 * will help full to achive thread pull concept
		 */
		service.execute(new Task());

	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out
				.println("Hi It will execute by while call execute() cause no return type");
	}

}
