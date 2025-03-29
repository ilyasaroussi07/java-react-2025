package UD04 JAVA;

public class ClaseInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  Integer num1=new Integer("125");
		int num1 = 125;

//		  Integer num2=new Integer(20);
		int num2 = 20;

		int n1 = num1;
		int n2 = num2;
		System.out.println("Suma de " + n1 + " y " + n2 + " vale " + (n1 + n2));
		if (n1 + n2 > 130)
			n1++;
		else
			n1--;
		System.out.println(n1);
	}
}
