package main.java.com.cjafet.singleton;

public class ThreadsafeSingleton {
	
	private static volatile ThreadsafeSingleton instance = null;
	
	private ThreadsafeSingleton() {
		if (instance != null) { // protect against reflection
			throw new RuntimeException("Use getInstance() method to create");
		}	
	}
	
	public ThreadsafeSingleton getInstance() {
		if (instance == null) {
			synchronized(ThreadsafeSingleton.class) {				
				if (instance == null) {				
					instance = new ThreadsafeSingleton();
				}
			}
		}
		
		return instance;
	}

}
