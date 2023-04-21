package Guia1P3;

	import java.util.Scanner;

public class EJERC25 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int n;
		
		System.out.println("ingrese su valor");
		n=tc.nextInt();
		
		if(n%3==0) {
			System.out.println("el numero es divisible entre tres");
		}
		
		else {
			System.out.println("el numero no es divisible entre tres");
		}
		
		
		
	}

}
