package interfaces;

interface lol 
{
	void show();
}

class Implimentor implements lol {
	
	public void show() {
		System.out.println("Loll");
	}
	
}

public class WhyInterface {

	public static void main(String[] args) {
		
		lol aha = new Implimentor();
	    
		aha.show();
		

	}

}
