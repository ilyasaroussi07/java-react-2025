import javax.swing.JOptionPane;

public class T5ejercicio10 {

	public static void main(String[] args) {
		String cuantasVentas = "";
		cuantasVentas = JOptionPane.showInputDialog("Introduce las ventas: ");
        int ventas= Integer.parseInt(cuantasVentas);
       	int valor = 0;
        for (int i = 1; i <= ventas; i++) {
        	String totalVenta = "";
        	totalVenta = JOptionPane.showInputDialog("Introduce el valor "
        			+ "		total de la venta " + i);
            valor+= Integer.parseInt(totalVenta);
		}
        
        //Tercera etapa mostrar los datos finales, o total de ventas
        JOptionPane.showMessageDialog(null, "El valor de ventas totales es " 
        								+ valor);
//        System.out.println("El valor de ventas totales es " + valor);
	}

}
