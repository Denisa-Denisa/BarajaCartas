package barajaCartas;

public class Ejercicio9 {
/*
	Vamos a hacer una baraja de cartas espa�olas orientado a objetos.
	Una carta tiene:
	 	- un n�mero entre 1 y 12 (el 8 y el 9 no los incluimos) y 
	 	- un palo (espadas, bastos, oros y copas)
	La baraja estar� compuesta por un conjunto de cartas, 40 exactamente.
	Las operaciones que podr� realizar la baraja son:
	- barajar: cambia de posici�n todas las cartas aleatoriamente
	- siguienteCarta: devuelve la siguiente carta que est� en la baraja, 
	  	cuando no haya m�s o se haya llegado al final, se indica al usuario 
	  	que no hay m�s cartas.
	- cartasDisponibles: indica el n�mero de cartas que a�n puede repartir
	- darCartas: dado un n�mero de cartas que nos pidan, le devolveremos ese n�mero 
		de cartas (piensa que puedes devolver). En caso de que haya menos cartas que 
		las pedidas, no devolveremos nada pero debemos indic�rselo al usuario.
	- cartasMonton: mostramos aquellas cartas que ya han salido, si no ha salido 
		ninguna indic�rselo al usuario
	- mostrarBaraja: muestra todas las cartas hasta el final. Es decir, si se saca 
		una carta y luego se llama al m�todo, este no mostrar� esa primera carta.
 */
	
	public static void main(String[] args) {

		Baraja baraja = new Baraja();
		
		baraja.mostrarBaraja();
		
		baraja.barajar();
		System.out.println();
		baraja.mostrarBaraja();
		baraja.cartasMonton();
		System.out.println();
		Carta carta = baraja.siguienteCarta();
		System.out.println(carta);
		System.out.printf("Queda %d cartas", baraja.cartasDisponibles());
		System.out.println();
		baraja.mostrarBaraja();
		System.out.println();
		baraja.cartasMonton();
		
		baraja.darCartas(4);
		System.out.println();
		baraja.mostrarBaraja();
		System.out.println();
		baraja.cartasMonton();
		
		baraja.darCartas(50);
	}

}
