package innerClass;

class outer {
	
	public void show() {
		System.out.println("hii");
	}
	
	class inner {
		
		public void display() {
			System.out.println("Hello-world");
			
		}
		
	}
	
	
}

public class InnerClass {

	public static void main(String[] args) {
		
    outer obj = new outer();
    
    obj.show();
    
    outer.inner obj1 = obj.new inner();
    
    obj1.display();
    

	}

}
