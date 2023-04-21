package guia1;

import java.util.Scanner;

public class EJERC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Y, X, C=2.5;
		String sel=null;
		Scanner tc=new Scanner(System.in);
		System.out.println("Desea darle un valor especifico a X? \n y/n");				
		sel=tc.next();
		
		switch(sel){
			
			case "y":
				
				System.out.println("Que valor desea otrorgarle a X?");
			X=tc.nextInt();
			
			Y=X*C-2;
			System.out.println("La respuesta es:"+Y);
			break;
			
			case "n":
				System.out.println("el valor de X sera el predeterminado");
			
			Y=2*C-2;
			
			System.out.println("la respuesta es:"+Y);
			break;
			default:
			System.out.println("la opcion es invalida");
		}
		

	}

}
