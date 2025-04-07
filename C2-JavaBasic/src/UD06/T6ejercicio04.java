package UD06;

import java.util.Scanner;

public class T6ejercicio04 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(" -- Número a su factorial --");
		System.out.println("Por favor, introduce el número entero deseado:");

		numero = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("El factorial de " + numero + " generado es: " + calcularFactorial(numero));

//		System.out.println("El factorial de " + numero +" generado es: " + factorial(numero));

	}

	// Cáclulo del factorial de un número entero
	public static int calcularFactorial(int n) {

		for (int i = n; i >= 2; i--) {
			n *= i - 1;
		}
		
//		Factorial de 4 es = 4*3*2 = 24
//
//		n por scanner le doy el número 4
//
//		i = n es decir, 
//		i = 4
//		n = 4
		
//		i >= 2 ? si (primer bucle for)
//		n *= i - 1; // n = 4 * (4-1)
//		i = 3
//		n = 12
		
//		i >= 2 ? si (segundo bucle for)
//		n *= i - 1; // n = 12 * (3-1)
//		i = 2
//		n = 24
		
//		i >= 2 ? si (tercer bucle for)
//		n *= i - 1; // n = 24 * (2-1)
//		i = 1
//		n = 24
//		i >= 2 ? no
//      fin del bucle for y devuelve el valor n = 24
		
		// Incrementando
//		for (int i = 1; i <= n; i++) {
//			n *= i;
//		}

		return n;
	}

	// Factorial de Manel
	public static int factorial(int n) {
		n = Math.abs(n);

		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
