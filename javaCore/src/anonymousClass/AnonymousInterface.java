package anonymousClass;

interface lol 
{
	void aha();
}

public class AnonymousInterface {

	public static void main(String[] args) {
		
		lol a = new lol() {
			public void aha() {
				System.out.println("LOL");
			}
		};
		
		a.aha();

	}

}
