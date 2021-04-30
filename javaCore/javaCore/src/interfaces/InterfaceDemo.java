package interfaces;
interface writer{
     void write() ;
	
}
class pen implements writer {
	
	public void write() {
		System.out.println("Iam pen");
	}
	
}
class pencil implements writer {
	public void write() {
		System.out.println("Iam pencil");
		
	}
	
}
class kit{
	public void doSomething(writer p) {
		p.write();
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		kit k = new kit();
		pen p = new pen();
		pencil pc = new pencil();
		
		
		
		k.doSomething(pc);
		k.doSomething(p);
		

	}

}
