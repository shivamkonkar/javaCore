package threadDemo;

public class Main {

	public static void main(String[] args) {
	
		Hi ob1 = new Hi();
		Hello ob2 = new Hello();
		
		ob1.start();
		ob2.start();
		
		
		
	}

}
