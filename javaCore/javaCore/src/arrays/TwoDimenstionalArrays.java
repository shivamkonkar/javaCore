package arrays;

import java.util.Scanner;

public class TwoDimenstionalArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int a[][] = new int[b][c]; 
		
		for(int i = 0; i < b ; i++) {
			
			for(int k = 0 ; k < c ; k++) {
				
				
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
