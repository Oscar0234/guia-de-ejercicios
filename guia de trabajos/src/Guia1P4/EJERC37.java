package Guia1P4;

import java.util.Scanner;

public class EJERC37 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
			int n, pares=0, impares=0;
			
			do {
				System.out.println("ingrese el valor de su numero \n pulse 0 para salir");
				n=tc.nextInt();
				
				if(n!=0) {
					if((n%2)==0 ) {
					pares++;
					
					}else {
						impares++;
					}
				}	
			}while(n!=0);	
		
		System.out.println("lacantidad de numeros pares es:"+pares);
		System.out.println("la cantidad de numeros impares es"+impares);
		
		
		
		
		
	}

}
