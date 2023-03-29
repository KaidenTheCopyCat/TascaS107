package n1exercici2;

public class TreballadorPresencial extends Treballador {

	private static int benzina;
	
	public TreballadorPresencial(String nom, String cognom, int preuHora, int benzina) {
		super(nom, cognom, preuHora);
		this.benzina=benzina;
	}

	@Override
	public int calcularSou(int hores) {
		return super.calcularSou(hores)+benzina;
	}

	@Override
	public String toString() {
		return "TreballadorPresencial ["+super.toString() + "[Benzina= " +benzina + "]]";
	}
	
	@Deprecated
	 public void obsolet1() {
		System.out.println("Soc el metode obsolet de Treballador Presencial");
	 }

}
