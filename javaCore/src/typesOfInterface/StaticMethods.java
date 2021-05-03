package typesOfInterface;

interface happy
{
	static void show() { 
		System.out.println("hahaha");
	}
	
	int n = 8; //variable inside interface is by default constant
}

public class StaticMethods {
 
	public static void main(String[] args) {
    
		happy.show();
	

	}

}
