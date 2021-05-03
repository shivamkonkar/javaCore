package typesOfInterface;



interface Demo
{
	void abc();
	default void lol(){
	System.out.println("lol");
	}
}

class ohk implements Demo {
	public void abc() {
		System.out.println("in abc");
		
	
		
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
	
	 Demo o = new ohk();
	o.abc();
	o.lol();

	}

}
