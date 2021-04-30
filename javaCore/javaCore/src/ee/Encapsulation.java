package ee;

class student{
	
	private int rollNo ;
	private String name;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

public class Encapsulation {
	
public static void main(String[] args) {
	
	student s1 = new student();
	s1.setRollNo(22);
    s1.setName("raj");
	System.out.println(s1.getRollNo());
	System.out.println(s1.getName());
}

}