package classAndObject;

import java.util.Scanner;

class con{
	
	double num1;
	int num2;
	double result;           
	
	public con() {
		num1= 5;
		num2=5;
	}
	
	public con(double d,int n) {
		
		num1 = d;
		num2 = n;
		
	}
	
	
	public void addition(){
		result=num1+num2;
	}
	
}

public class Constuctor {

	public static void main(String[] args) {
	System.out.println("Enter Numbers");
	Scanner sc = new Scanner(System.in);
	
	con obj = new con(sc.nextDouble(),sc.nextInt());
	
	obj.addition();
	
	System.out.println(obj.result);

	}

}
