package com.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

 class CustomExecutorService
	{

		static int capacity;
		static int currentCapacity;
		static LinkedBlockingQueue<Runnable> linkedBlockingQueue;
		Execution	e;

		CustomExecutorService(int capacity )
			{
				this.capacity=capacity;
				currentCapacity=0;
				linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
				e= new Execution();
			}


		static CustomExecutorService myNewFixedThreadPool(int capacity) {
			return new CustomExecutorService(capacity);
		}

		public void submit(Runnable r) {
			linkedBlockingQueue.add(r);
			e.executeMyMethod();
		}

	}

class Execution implements Runnable {

	void executeMyMethod() {
		if (CustomExecutorService.currentCapacity < CustomExecutorService.capacity) {
			CustomExecutorService.currentCapacity++;
			Thread t = new Thread(new Execution());
			t.start();
		}
	}

	@Override
	public void run() {
		while (true) {
			if (CustomExecutorService.linkedBlockingQueue.size() != 0) {
				CustomExecutorService.linkedBlockingQueue.poll().run();
			}
		}
	}
}

class Mytask implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hii" + Thread.currentThread().getName());
	}
}



public class ExecutorServiceCustom {

	public static void main(String[] args) {
 // ExecutorService ex = Executors.newCachedThreadPool();
		CustomExecutorService service = CustomExecutorService.myNewFixedThreadPool(3);
		for (int i = 0; i < 20; i++) {
			service.submit(new Mytask());
		}
	}
}