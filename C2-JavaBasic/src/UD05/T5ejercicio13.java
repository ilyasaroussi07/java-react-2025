package UD05;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class T5ejercicio13 {

	public static void main(String[] args) {
		// INPUTS de usuario
				int op1 = Integer.parseInt(JOptionPane.showInputDialog("" 
							+ "Introduce el primer operador: "));
				int op2 = Integer.parseInt(JOptionPane.showInputDialog("" 
							+ "Introduce el segundo operador: "));
				//Equivalente el JOPtionPane con Scanner
//				String signo = JOptionPane.showInputDialog("Introduce signo aritmético: ");
				Scanner escanerConsola = new Scanner(System.in);
				System.out.println("Introduce signo aritmético: ");
				String signo = escanerConsola.nextLine();
				escanerConsola.close();
				
				
				String resultado = "";
				// Cálculos
				switch (signo) {
					case "+":
						resultado = "Suma " + op1 + signo + op2 + " = " + (op1 + op2);
						break;
					case "-":
						resultado = "Resta " + op1 + signo + op2 + " = " + (op1 - op2);
						break;
					case "/":
						if (op2 == 0) {
							resultado = "No se puede dividir por 0";
						} else {
							resultado = "Divide " + op1 + "/" + op2 + " = " + (op1 / op2);
						}
						break;
					case "*":
						resultado = "Multiplica " + op1 + "*" + op2 + " = " + (op1 * op2);
						break;
					case "^":
						resultado = "Exponente " + op1 + "^" + op2 + " = " + (Math.pow(op1, op2));
						break;
					case "%":
						resultado = "El resto de " + op1 + "%" + op2 + " = " + (op1 % op2);
						break;
					default:
						resultado = "Esto no es un símbolo de operación aritmética";
						break;
				}
				System.out.println(resultado);
				JOptionPane.showMessageDialog(null, resultado);
				
			
	}

}
