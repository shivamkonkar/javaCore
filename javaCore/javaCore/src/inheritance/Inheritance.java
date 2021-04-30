package inheritance;

class calc{
	
	public int add(int i, int j) {
		
		return i+j;
		
	}
}
	
class adv extends calc {
	
	public int sub(int i, int j) {
		return i-j;
	}
	
}
	


public class Inheritance {

	public static void main(String[] args) {
		
		
	adv c = new adv();
	
	int result = c.add(5,4);
	int result1 = c.sub(5,4);
	
	System.out.println(result);
	System.out.println(result1);
		
	
		
		

	}

}
