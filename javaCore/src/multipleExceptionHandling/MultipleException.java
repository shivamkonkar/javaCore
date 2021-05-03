package multipleExceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[6];
			a[6]= 7;
			int i =7;
			int k =0 ;
			int p = i/k;
			System.out.println("All good");
		}
		catch(ArithmeticException e) {
			System.out.println("Arith Error");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array issue");
		}
		finally {
			System.out.println("ur dumb");
		}
	}

}
