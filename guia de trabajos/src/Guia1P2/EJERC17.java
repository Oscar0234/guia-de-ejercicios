package Guia1P2;

import java.util.Scanner;

public class EJERC17 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double ET,EC,EP,M,V,H,G=9.8;	
		
		
		System.out.println("ingrese la masa de el cuerpo");
		M=tc.nextInt();
		System.out.println("Ingrese la velicidad del cuerpo");
		V=tc.nextInt();
		System.out.println("ingrese la altura a la que se encuentra el cuerpo");
		H=tc.nextInt();
		
		EC=(M/2)*(V*V);
		
		System.out.println("Energia sinetica es igual a:"+EC);
		
		EP=M*H*G;
		
		System.out.println("energia potencial es igual a:"+EP);
		
		ET=EC+EP;
		
		System.out.println("energia total es igual a:"+ET);
		
		
	}

}
