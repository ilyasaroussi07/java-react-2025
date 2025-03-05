import java.util.Scanner;
import javax.swing.JOptionPane;

public class T5ejercicio2 {

	public static void main(String[] args) {
		
		String nombre = "Ilyas";
//		System .out .println("Bienvenido " + nombre);
//		String usuario="ilyas-moha";
//		System .out .println("Mensaje bienvenida a " + usuario);
		
		//Recopilar datos por JOptionPane
		nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System .out .println("Bienvenido " + nombre);
		
		//Recopilar datos por Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
		//Cierrar el Scanner
		sc.close();
	}

}
