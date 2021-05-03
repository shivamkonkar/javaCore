package synchronizedThread;

class Counter
{
	int counter;
	
	public synchronized void add() {
		
		counter++;
		
	}
}

public class Synchronized  {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t = new Thread(new Runnable()
				{
			public void run() {
				for(int i =1; i<=1000;i++) {
					c.add();
				}
			}
		});
		
		Thread t1 = new Thread(new Runnable()
		{
	public void run() {
		for(int i =1; i<=1000;i++) {
			c.add();
		}
	}
});
		
	t.start();
	t1.start();
	t.join();
	t1.join();
System.out.println(c.counter);
	}

}
