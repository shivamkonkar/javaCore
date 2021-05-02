package exceptionHandling;

public class tryCatchFinally {

	public static void main(String[] args) {
		
		try         //try block will execute if there is no error
		{
			int i =9;
			int k = 0;
			int p = i/k;
			System.out.println("No error");
		}
		catch(Exception e)            // catch block will execute if there is error           
		{
			System.out.println("Error");
		}
		finally         //finally block will execute anyways
		{
			System.out.println("LOL");
		}

	}

}
