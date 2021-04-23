package ifAndElse;

import java.util.Scanner;

public class Oddandeven {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n =sc.nextInt();
	
	if(n==0) {
		
		System.out.println("Nothing");
		
	}
	
	else if(n%2==0) {
		
		System.out.println("Given number is even!!");
		
	}
	
	else {
		
		System.out.println("Given number is odd!!");
		
	}

	}

}
