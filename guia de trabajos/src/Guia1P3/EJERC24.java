package Guia1P3;

import java.util.Scanner;

public class EJERC24 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int A,X=2,Y;
		
		System.out.println("ingrese su valor");
		A=tc.nextInt();
		
		Y=X;
		
		if(A>0) {
			for(int i=1; i<A; i++) 
			{Y=2*Y;}
			System.out.println(""+Y);
		}
		
		
		
	}

}
