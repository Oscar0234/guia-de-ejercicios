package Guia1P2;

import java.util.Scanner;

public class EJERC12 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int L,M,C,S,I,H,n;
		
		System.out.println("Ingrese la nota de Literatura");
		L=tc.nextInt();
		System.out.println("Ingrese la nota de Matematicas");
		M=tc.nextInt();
		System.out.println("Ingrese la nota de Ciencias");
		C=tc.nextInt();
		System.out.println("ingrese la nota de Sociologia");
		S=tc.nextInt();
		System.out.println("Ingrese la nota de Ingles");
		I=tc.nextInt();
		System.out.println("Ingrese la nota de Historia");
		H=tc.nextInt();
		
		n=(L+M+C+S+I+H)/6;
		
		System.out.println("El promedio de notas es:"+n);
		
		
	}

}
