package scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		int i[] = new int[50001];
		
		for(int k = 1;k<=50000;k++) {
			
			i[k]=k;

	}
		for(int k = 1; k<=50000; k++) {
			System.out.println(i[k]*20);
		}

}
}
