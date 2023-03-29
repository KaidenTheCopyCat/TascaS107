package n1exercici2;

public class TreballadorOnline extends Treballador {

	private final int TARIFA_PLANA;
	
	public TreballadorOnline(String nom, String cognom, int preuHora, int tarifaPlana) {
		super(nom, cognom, preuHora);
		this.TARIFA_PLANA=tarifaPlana;
	}

	@Override
	public int calcularSou(int hores) {
		return super.calcularSou(hores)+TARIFA_PLANA;
	}

	@Override
	public String toString() {
		return "TreballadorOnline ["+super.toString()+"TARIFA_PLANA=" + TARIFA_PLANA + "]";
	}

	 @Deprecated
	 public void obsolet2() {
		 System.out.println("Soc el metode obsolet de Treballador Online");
	 }
	
	
}
