import javax.swing.JOptionPane;

public class T5ejercicio5 {

	public static void main(String[] args) {
//		Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
//      debemos indicarlo.

		int numero = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "	Introduce un número: "));
		int resto = numero % 2;

		if (resto == 0) {
			JOptionPane.showMessageDialog(null, "Si es par");
		} else {
			JOptionPane.showMessageDialog(null, "Es impar");
		}

	}

}
