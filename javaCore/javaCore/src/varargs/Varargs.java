package varargs;

class calc{
	
	public int addo(int ... n) {
		
		int sum = 0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}

	
	
}

public class Varargs {

	public static void main(String[] args) {
		
		
		calc obj = new calc();
		System.out.println(obj.addo(3,4,3,3,4));

	}

}
