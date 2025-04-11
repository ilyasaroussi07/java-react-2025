package UD08;

public class MainCoche {

	public static void main(String[] args) {

		String color = "Verde";
		System.out.println(color);
		double numero = 5.6;
		System.out.println(numero);
		
		
		Coche coche1 = new Coche(); //Instanciación
		Coche coche2 = new Coche("Toyota", "Corolla", "Rojo");

        coche1.setMarca("Ford");
        coche1.setModelo("Focus");
        coche1.setColor("Azul");
        
        System.out.println(coche1.getMarca());
        System.out.println(coche2.getMarca());
        
        System.out.println(coche1.acelerar());
        System.out.println(coche2.frenar());
        
        System.out.println("\nMarca del coche 1: " + coche1.getMarca());
        System.out.println("Modelo del coche 2: " + coche2.getModelo());
        
        System.out.println("Color del coche 1: " + coche1.getColor());
        System.out.println("Color del coche 2: " + coche2.getColor());
        
	}

}
