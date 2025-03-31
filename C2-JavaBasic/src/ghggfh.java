
public class ghggfh {

	public static void main(String[] args) {
		
		import java.util.Random;
		import java.util.Scanner;

		public class MultiplicacionArrays {

		    public static int[] crearArray(int dimension) {
		        Random rand = new Random();
		        int[] array = new int[dimension];
		        for (int i = 0; i < dimension; i++) {
		            array[i] = rand.nextInt(100) + 1; // Genera números aleatorios entre 1 y 100
		        }
		        return array;
		    }

		    public static int[] multiplicarArrays(int[] array1, int[] array2) {
		        int[] arrayResultante = new int[array1.length];
		        for (int i = 0; i < array1.length; i++) {
		            arrayResultante[i] = array1[i] * array2[i];
		        }
		        return arrayResultante;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Solicitar dimensión por teclado
		        System.out.print("Introduce la dimensión de los arrays: ");
		        int dimension = scanner.nextInt();
		        
		        // Crear el primer array con números aleatorios
		        int[] array1 = crearArray(dimension);
		        // Hacer que el segundo array apunte al primero (en realidad en Java esto no es posible, así que se crea un nuevo array)
		        int[] array2 = crearArray(dimension);
		        
		        // Crear un nuevo array con la multiplicación de los valores correspondientes
		        int[] resultado = multiplicarArrays(array1, array2);
		        
		        // Mostrar los arrays y el resultado
		        System.out.println("Array 1: ");
		        for (int num : array1) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		        
		        System.out.println("Array 2: ");
		        for (int num : array2) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		        
		        System.out.println("Resultado: ");
		        for (int num : resultado) {
		            System.out.print(num + " ");
		        }
		    }
		}


	}

}
