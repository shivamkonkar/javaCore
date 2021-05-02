package typesOfInterface;

interface Abc{
	void show();

}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		Abc a = () -> System.out.println("GG");
		a.show();

	}

}
