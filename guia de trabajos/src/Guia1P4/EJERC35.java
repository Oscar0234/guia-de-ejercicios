package Guia1P4;

import java.util.Scanner;

public class EJERC35 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int a,b,c,s,p;
		
		System.out.println("Ingrese su primer valor");
		a=tc.nextInt();
		System.out.println("Ingrese su segundo valor");
		b=tc.nextInt();
		System.out.println("ingrese su tercer valor");
		c=tc.nextInt();
		
		s=a+b+c;
		p=s/3;
		System.out.println("La suma de los valores es:"+s);
		System.out.println("El promedio de los valores es:"+p);
		
		
		
		
		
	}

}
