package guia1;

import java.util.Scanner;

public class EJERC9 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double V,r,h,PI=3.14159;
		
		System.out.println("Ingrese el radio de el cilindro");
		r=tc.nextDouble();
		System.out.println("ingrese la altuna de el cilindro");
		h=tc.nextDouble();
		
		V=PI*(r*r)*h;
		
		System.out.println("Con un radio de:"+r
				+"\ny una altura de:"+h
				+"\nEl volumen de el cilindro es="+V);
		
		
		
		
		
		
		
		
		
		
		
	}

}
