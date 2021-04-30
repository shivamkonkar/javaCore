package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
    long a = sc.nextLong();
	long b =sc.nextLong();
	String opt = sc.next();
	int k = 1;
	long r = 1;
	
	switch(opt) {
	
	case "+" : System.out.println(a+b);
	break;
	
	case "-" : System.out.println(a-b);
	break;
	
	case "*" : System.out.println(a*b);
	break;
	
	case "/" : System.out.println(a/b);
	break;
	
	case "p" : 
		
		while(k <= b){
			r = r*a;
			k++;
			
			
		}System.out.println(r);break;
	
	case "r" : System.out.println(a%b);
	}
	
		
		
	}

}
