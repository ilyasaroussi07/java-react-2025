package UD05;
import javax.swing.JOptionPane;

public class T5ejercicio06 {

	public static void main(String[] args) {
    
	
		    final double IVA = 0.21; // 21%
			double IRPF = 0.15;

//			IVA= 0.22;
			IRPF = 0.18;
			double precioBase = Double.parseDouble(JOptionPane.showInputDialog(""
					+ "Introduce un precio de base: "));
			double precio = precioBase + precioBase * IVA;

			JOptionPane.showMessageDialog(null, "" + "El precio final es: " 
										+ precio);

		

	}

}
