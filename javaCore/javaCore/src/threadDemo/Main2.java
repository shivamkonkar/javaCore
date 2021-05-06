package threadDemo;

public class Main2 {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread( ()->
		{
			for(int i = 1; i<=5;i++) {
			System.out.println("Hi "+Thread.currentThread().getPriority());
			try {Thread.sleep(1000);}catch(Exception e) {}
			}
	},"Hi Thread"	);
		Thread t2 = new Thread(()->{
		
			for(int i = 1; i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e) {}
			    }
		    
    }, "Hello Thread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		System.out.println(t1.getPriority()+"\n"+t2.getPriority());
		System.out.println(t1.getName()+"\n"+t2.getName());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Byee");
		
	}

}
