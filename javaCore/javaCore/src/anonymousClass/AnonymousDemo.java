package anonymousClass;

class A{
	public void show() {
		
		System.out.println("in A show");
		
	}
}


public class AnonymousDemo {

	public static void main(String[] args) {
		
		A i = new A() { 
			public void show() {
				System.out.println("Lol");
			}	
		};
		i.show();
		

	}

}
