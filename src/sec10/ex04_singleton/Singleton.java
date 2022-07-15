package sec10.ex04_singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}

}
