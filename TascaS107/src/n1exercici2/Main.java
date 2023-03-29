package n1exercici2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		TreballadorPresencial tp= new TreballadorPresencial("T", "P", 5, 2);
		TreballadorOnline to = new TreballadorOnline("T", "O", 5, 10);
		
		tp.obsolet1();
		to.obsolet2();
		
	}
	
}
