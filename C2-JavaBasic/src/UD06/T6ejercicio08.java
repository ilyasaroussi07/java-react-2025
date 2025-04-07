package UD06;

import javax.swing.JOptionPane;

public class T6ejercicio08 {

	public static void main(String[] args) {
		int[] numeros = new int[3]; //Ejemplo con 3 pero son 10
		rellenarValores(numeros);
		mostrarValores(numeros);
	}

	private static void mostrarValores(int[] numeros) {
		// Recorrer y mostrar todos los valores
		
		for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Índice: " + i + " - Valor: " + numeros[i]);
            JOptionPane.showMessageDialog(null, "Índice: " + i 
            								+ " - Valor: " + numeros[i]);
		}

	}

	private static void rellenarValores(int[] numeros) {
		// Rellenar valores por pantalla JOPtionPane
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("" 
					+ "Introduce un número"));
		}

	}


	}


