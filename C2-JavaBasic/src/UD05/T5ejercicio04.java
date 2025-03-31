package UD05;
import javax.swing.JOptionPane;

public class T5ejercicio04 {

	public static void main(String[] args) {
//		 Haz una aplicación que calcule el área de un circulo (pi*R2). El radio se pedirá por teclado
//		(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
//		método pow de Math
		
		double radio = 0;
		double area = 0;
		//Pedimos el radio del circulo por JOptionPane
		radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo: "));
		//Calculas el area del circulo
//		area = Math.PI * Math.pow(radio, 2);
		area = 3.1416 * radio * radio;
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);

	}

}
