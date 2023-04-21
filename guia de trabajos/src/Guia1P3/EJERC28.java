package Guia1P3;

	import java.util.Scanner;

public class EJERC28 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int n1,n2;
		
		System.out.println("ingrese el primer valor");
		n1=tc.nextInt();
		System.out.println("ingrese el segundo valor");
		n2=tc.nextInt();
		
		if(n1>0 & n2>0) {
			System.out.println("signos iguales");
		}
		
		else if(n1>0 & n2<0) {
			System.out.println("signos opuestos");
		}
		
		else if(n1<0 & n2>0) {
			System.out.println("signos opuestos");
		}
		
		
	}

}
