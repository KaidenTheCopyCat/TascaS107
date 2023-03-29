package n1exercici1;

public class Treballador {

	private String nom,cognom;
	private int preuHora;
	
	public Treballador(String nom, String cognom, int preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getPreuHora() {
		return preuHora;
	}
	
	public int calcularSou(int hores) {
		return hores*preuHora;
	}

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", cognom=" + cognom + ", preuHora=" + preuHora + "]";
	}
	
}
