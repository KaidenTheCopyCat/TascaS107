package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treballador tn = new Treballador("T", "N", 5);
		TreballadorPresencial tp= new TreballadorPresencial("T", "P", 5, 2);
		TreballadorOnline to = new TreballadorOnline("T", "O", 5, 10);
		
		System.out.println("Sou Treballador: "+ tn.calcularSou(2));
		System.out.println("Sou Treballador Presencial: "+ tp.calcularSou(2));
		System.out.println("Sou Treballador Online: "+ to.calcularSou(2));
		
		
	}

	
}
