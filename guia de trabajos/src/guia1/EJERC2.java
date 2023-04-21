package guia1;

import java.util.Scanner;

public class EJERC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc=new Scanner(System.in);
		double R, D, C, A, PI=3.1416;
		
		System.out.println("ingrese el radio de el circulo");
		R=tc.nextInt();
		
		C=2*PI*R;
		A=PI*R*R;
		
		System.out.println("La circunferencia de el circulo es:"+C);
		System.out.println("el area de el circulo es:"+A);
		
		
		
		

	}

}
