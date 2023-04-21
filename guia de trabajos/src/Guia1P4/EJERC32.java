package Guia1P4;

import java.util.Scanner;

public class EJERC32 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Ingrese la nota de el alumno");
		n=tc.nextInt();
		
		if(n<=100 & n>89) {
			System.out.println("la nota de el alumno es:A");
		}
		
		if(n<=89 & n>79) {
			System.out.println("la nota de el alumno es:B");
		}
		
		if(n<=79 & n>69) {
			System.out.println("la nota de el alumno es:C");
		}
		else if(n<=69 & n>65) {
			System.out.println("la nota de el alumno es:D");
		}
		
		else if(n<65){
			System.out.println("la nota de el alumno es:E");
		}
		
		
		
		
		
		
	}

}
