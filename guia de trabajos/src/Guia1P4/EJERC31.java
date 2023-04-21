package Guia1P4;

import java.util.Scanner;

public class EJERC31 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("ingrese el valor de el lado A");
		a=tc.nextInt();
		System.out.println("ingrese el valor de el lado B");
		b=tc.nextInt();
		System.out.println("ingrese el valor de el lado C");
		c=tc.nextInt();
		
		
		if(a==b && b==c && c==a) {
			System.out.println("el triangulo es equilatero");
		}
		
		else if(a==b || a==c || b==c) {
			System.out.println("en triangulo es isocele");
		}
		
		else {
			System.out.println("el triangulo es escaleno");
		}
		
		
		
		
		
		
	}

}
