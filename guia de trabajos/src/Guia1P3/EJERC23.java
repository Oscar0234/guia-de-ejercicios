package Guia1P3;

import java.util.Scanner;

public class EJERC23 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		int n;
		
		System.out.println("ingrese la nota de el alumno");
		n=tc.nextInt();
		
		if(n<=59) {
			System.out.println("reprovado");
		}
		
		else if(n>59) {
			System.out.println("aprovado");
		}
		
		
	}

}
