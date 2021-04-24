package classAndObject;

import java.util.Scanner;

class add{
	
	int num1 ;
	int num2 ;
	int result ;
	
	public void perform()
	{
		result = num1 + num2 ;
	}
	
}

public class MethodAndClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		add obj = new add();
		
		obj.num1=sc.nextInt();
		obj.num2=sc.nextInt();
		obj.perform();
		System.out.println(obj.result);

				
		
		

	}

}
