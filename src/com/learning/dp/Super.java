package com.learning.dp;

 class TestApp {
	 String args[] = { "1", "2" };
	public static void main(String args[]) {
		if (args.length > 0)
			System.out.println(args.length);
	}
}

public class Super {
	public int index = 1;
}
class App extends Super {
	public App(int index) {
		index = index;
	}
	public static void main(String args[]) {
		App myApp = new App(10);
		System.out.println(myApp.index);
	}
}