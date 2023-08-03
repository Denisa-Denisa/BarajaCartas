package barajaCartas;

public class Carta {
	private int valor;
	private String palo;

	public Carta(int valor, String palo) {
		super();
		this.setValor(valor);
		this.setPalo(palo);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public String toString() {
		return valor + " de " + palo;
	}
}
