package UD06;

public class BucleInfinito {

	public static void main(String[] args) {
		int numero = 1;
//		while (numero < 10) {
//			System.out.println("Número: " + numero);
////			numero++; bucle infinito
//		}

		for (int i = 3; i <= 15; i++) { //Deberias de incrementar en vez de decrementar para que no surja un bucle infinito
			System.out.println("Número: " + i);
		}

	}
}
