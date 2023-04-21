package Guia1P2;

import java.util.Scanner;

public class EJERC10 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int F,M,A;
		
		System.out.println("Ingrese la masa del objeto");
		M=tc.nextInt();
		System.out.println("Ingrese la aceleracion del objeto");
		A=tc.nextInt();
		
		//operacion
		F=M*A;
		
		System.out.println("Fuerza="+M+"x"+A+"= "+F+" Newton");
		
		
		
		
		
		
	}

}
