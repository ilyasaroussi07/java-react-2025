package UD05;
import javax.swing.JOptionPane;

public class T5ejercicio11 {

	public static void main(String[] args) {
		String semana = ""; // Inicializaciones en String

		semana = JOptionPane.showInputDialog("" + "Introduce el dia de la semana: ");

		semana = semana.toLowerCase();

		String laborableMensaje = "";

		switch (semana) {
			case "lunes", "martes", "miércoles", "jueves", "viernes":
				laborableMensaje = "Laborable";
				break;
			default:
				laborableMensaje = "No laborable " + " o no es un dia de la semana";
	//			default:
	//				laborableMensaje ="No hay valor o " 
	//						+ "no es un dia de la semana";
				break;
		}
		System.out.println(laborableMensaje);

	}

}
