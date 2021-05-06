package scanner;

public class Two extends Thread {
	
	public int a[]=new int[50002];
	
	public void run() {
		for (int i = 2; i<=50000;i=i+2) {
			a[i]=i;
			System.out.println(a[i]*20);
			
		}
	}
	
}
