package exceptionHandling;

public class CustomExceptions {

	public static void main(String[] args) {
		try {
		int i,j;
		i=3;
		j=7;
		int k = i/j;
		
		if(k==0) {
			throw new ShivamException("Shivam is Dumb");
		}
		
		}
		catch(Exception e) {
			System.out.println("ERror "+e);
		}

	}

}
