package Guia1P2;

import java.util.Scanner;

public class EJERC13 {

	public static void main(String[] args) {
		String sel=null;
		Scanner tc=new Scanner(System.in);
		
		double Y, F, L, cm;
		
		System.out.println("elija cual sera su convercion"
				+"\nyardas a centimetros:1"
				+"\npies a centimetros:2"
				+"\npùlgadas a centimetros:3");

		sel=tc.next();
		
		switch(sel) {
		
		case"1":
			System.out.println("Ingrese la cantidad de Yardas");
			Y=tc.nextDouble();
			
			cm=Y/0.01093;
			
			System.out.println(Y+"yardas="+cm+"centimetros");
			break;
			
		case"2":
			
			System.out.println("Ingrese la cantidad de pies");
			F=tc.nextDouble();
			
			cm=F/0.03281;
			
			System.out.println(F+"pies="+cm+"centimetros");
			break;
			
		case"3":
			System.out.println("Ingrese la cantidaad de pulgadas");
			L=tc.nextDouble();
			
			cm=L/0.39370;
			
			System.out.println(L+"pulgadas="+cm+"centimetros");
			break;
			default:
				System.out.println("la opcion que has elejido es invalida");
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
