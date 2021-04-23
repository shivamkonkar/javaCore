package staticDemo;

class Emp{
	int eid;
	int salary;
	static String CEO;
	
	public void show() {
		System.out.println(eid+" "+salary+" "+CEO);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		
		Emp shivam = new Emp();
		shivam.eid = 10;
		shivam.salary= 4000;
		
		Emp rhythm = new Emp();
		rhythm.eid = 12;
		rhythm.salary = 5000;

		Emp.CEO = "ROR";
		
	shivam.show();
	rhythm.show();
		
	}

}
