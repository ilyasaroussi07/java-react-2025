package UD06;
import javax.swing.JOptionPane;

public class T6ejercicio3 {

	public static void main(String[] args) {
		int numPrimo = 13; //Número que revisamos si es primo
//		boolean primoSiNo = true; //Booleano que guarda si es o no primo
		//Dividimos este numPrimo por todos sus números inferiores para comprobar 
		//si es primo o no
		numPrimo = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Introduce el número: "));

		
		//El resultado final de decir si es primo o no el número
		if (numeroPrimo(numPrimo)) {
			System.out.printf("El %d es primo o <=1", numPrimo).println();
//			System.out.println("El "+ numPrimo + " es primo o <=1");
		} else {
			System.out.printf("El %d no es primo", numPrimo).println(); 
		}
	}
	
	public static boolean numeroPrimo (int valorPrimo) {
		boolean primoSiNo = true;
//		for(int i=valorPrimo-1; i>1; i--) {
//			if(valorPrimo%i == 0) {
//				primoSiNo = false;
//			}
//		}
		
		for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
            if (valorPrimo % i == 0) {
            	primoSiNo = false;
				return primoSiNo;
				//Equivalente:
				//primoSiNo = false;
				//break;
			}
		}
		
		return primoSiNo;
	}

	}


