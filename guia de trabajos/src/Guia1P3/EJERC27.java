package Guia1P3;

import java.util.Scanner;

public class EJERC27 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int P,R;
		
		System.out.println("ingrese la cantidad de pantalones vendidos");
		P=tc.nextInt();
		
		if(P<=2) {
			R=P*12;
			System.out.println("el total de ventas es de:"+R+" Dolares");
		}
		
		else if(P>2) {
			R=P*10;
			
			System.out.println("el total de ventas es de:"+R+" Dolares");
		}
		
		
	}

}
