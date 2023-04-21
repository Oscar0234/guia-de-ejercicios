package Guia1P4;

import java.util.Scanner;

public class EJERC36 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double n=0, s=0,p=0;
		double c=0;
		do
		{
			System.out.println("ingrese sus valores");
			n=tc.nextInt();
			if(n>0) {
				s=s+n;
				c++;}
			}while(n!=0);	
		p=s/c;
		
		System.out.println("la suma de los valores ingresados es:"+s);
		System.out.println("el promedio de los valores ingresados es:"+p);
		
		
		
		
		
		
		
	}

}
