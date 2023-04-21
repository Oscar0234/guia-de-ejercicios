package guia1;

import java.util.Scanner;

public class EJERC6 {

	public static void main(String[] args) {
		String sel=null;
		Scanner tc=new Scanner(System.in);
		
		double K,L;
		
		System.out.println("elija cual sera su convercion"
				+"\nKilogramos a Libras:1"
				+"\nLibras a Kilogramos:2");
		sel=tc.next();
		
		switch(sel) {
		
		case"1":
			System.out.println("Ingrese la cantidad de Kilogramos");
			K=tc.nextInt();
			L=K*2.2046226218;
			
			System.out.println(K+"Kilogramos="+L+"Libras");
			break;
			
		case"2":
			System.out.println("Ingrese la cantidad de Libras");
			L=tc.nextInt();
			
			K=L/2.2046226218;
			
			System.out.println(L+"Libras="+K+"Kilogramos");
			break;
			
			default:
				System.out.println("la opcion que has elegido es invalida");
		
		
		
		}
		
		
		
		
		
		
	}

}
