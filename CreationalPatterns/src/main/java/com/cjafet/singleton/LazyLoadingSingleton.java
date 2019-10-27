package main.java.com.cjafet.singleton;

public class LazyLoadingSingleton {
	
	private static LazyLoadingSingleton instance = null;
	
	private LazyLoadingSingleton() {
		
	}
	
	public static LazyLoadingSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLoadingSingleton();
		}
		
		return instance;
	}

}
