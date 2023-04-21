package Guia1P3;

import java.util.Scanner;

public class EJERC21 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int x, res;
		
		System.out.println("Ingrese su valor");
		x=tc.nextInt();
		
		res=x;
		
		if(x>0) {
			
			for(int i=1; i<2; i++)
			{res=res*x;}
			
			System.out.println("el resultado es:"+res);
		}
		
		else if(x<0) {
			for(int i=1; i<4; i++) 
			{res=res*x;}
			System.out.println("el resultado es:"+res);
		}
		
		
		
		
	}

}
