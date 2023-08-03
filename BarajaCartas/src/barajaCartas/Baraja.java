package barajaCartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baraja {
	private static final int TIEMPO_BARAJADO = 1000;
	private static final String[] PALOS = { "Espadas", "Oros", "Copas", "Bastos" };
	private static final int[] VALORES = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };

	private List<Carta> cartas = new ArrayList<>();
	private List<Carta> monton = new ArrayList<>();
	
	public Baraja() {
		super();
		initBaraja();
	}

	private void initBaraja() {
		for (int p = 0; p < PALOS.length; p++) {
			for (int v = 0; v < VALORES.length; v++) {
				cartas.add(new Carta(VALORES[v], PALOS[p]));
			}
		}
	}

	public void mostrarBaraja() {
		for (Carta c : cartas) {
			System.out.printf("%2d de %s%n", c.getValor(), c.getPalo());
		}
	}
	public void cartasMonton() {
		if (monton.isEmpty()) {
			System.out.println("No hay cartas repartidas");
			return;
		}
		for (Carta c : monton) {
			System.out.printf("%2d de %s%n", c.getValor(), c.getPalo());
		}
	}
	public void barajar() {
		for (int i = 1; i <= TIEMPO_BARAJADO; i++) {
			int pos1 = damePosicionAleatoria();
			int pos2 = damePosicionAleatoria();

			Carta carta = cartas.get(pos1);
			cartas.set(pos1, cartas.get(pos2));
			cartas.set(pos2, carta);
		}
	}
	
	public Carta siguienteCarta() {
		if (cartas.isEmpty()) {
			System.out.println("No quedan cartas");
			return null;
		}
		
		Carta carta = cartas.get(cartas.size() - 1);
		cartas.remove(carta);
		monton.add(carta);
		return carta;
	}

	public int cartasDisponibles() {
		return cartas.size();
	}
	
	public List<Carta> darCartas(int cantidad) {
		if (cartas.size() < cantidad) {
			System.out.println("No hay cartas suficientes");
			return new ArrayList<Carta>();
		}
		
		int inicio = cartas.size() - cantidad;
		int fin = cartas.size();
		List<Carta> mano = cartas.subList(inicio, fin);
		monton.addAll(mano);
		cartas.removeAll(mano);
		return mano;
	}
	private int damePosicionAleatoria() {
		Random r = new Random();
		return r.nextInt(cartas.size());
	}
}
