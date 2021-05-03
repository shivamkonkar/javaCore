package ee;

abstract class Human
{
	public abstract void eat() ;
	
	public void walk() {
		
	}
	
	
}
class Man extends Human{
	public void eat() {
		
		System.out.println("Man Eat");
		
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		
		Human sc = new Man();
		
	sc.eat();

	}
	
}

