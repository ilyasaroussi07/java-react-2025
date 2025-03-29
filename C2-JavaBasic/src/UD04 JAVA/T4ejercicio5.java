
public class T4ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=5;
		int B=8;
		int C=6;
		int D=3;
		int COPIAB=B;
		
		System.out.println("Valores iniciales");
		System.out.println("A= "+A);
		System.out.println("B= "+B);
		System.out.println("C= "+C);
		System.out.println("D= "+D);
		B=C;
		C=A;
		A=D;
		D=COPIAB;
		System.out.println("\nValores finales");
		System.out.println("A= "+(A));
		System.out.println("B= "+(B));
		System.out.println("C= "+(C));
		System.out.println("D= "+(D));
		
		

	}

}
