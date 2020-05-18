package chap10;

public class MyThread extends Thread {
	// within run() we define our job(code we want to execute in separate thread).
	@Override
	public void run() {
		System.out.println("Important job running in MyThread");
	}
	
	// won t be called automaticcaly when starting the thread
	public void run(String s) {
		System.out.println("String in run is "+s);
	}
}

