package fibonnachi;

import java.util.Scanner;

public class Fibonnachi {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int a = 0;
	int b = 1;
	int c = sc.nextInt();
	int d = 0;
System.out.println("your numbers are");
	System.out.println("0");
	System.out.println("1");
	for(int i = 0; i < c-2;i++) {
		d= a+b;
		System.out.println(d);
		a= b;
		b= d;
		
		
	}

	}

}
