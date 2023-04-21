package guia1;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner7;

public class EJERC5 {

	public static void main(String[] args) {
		String sel=null;
		Scanner tc=new Scanner(System.in);
		int X1,X2,X3,Y,RES1,RES2,RES3;
		
		System.out.println("Desea darle un valor especifico a X?\ny/n");
		sel=tc.next();
		
		switch(sel) {
		case "y":
			System.out.println("Que valor desea otorgarle a X?");
			X1=tc.nextInt();
			
			X2=X1; X3=X1;
			RES1=X1;RES2=X2;RES3=X3;
			
			for(int i=1; i<4; i++)
			{RES1=X1*RES1;}
			
			for(int i=1; i<3; i++)
			{RES2=X2*RES2;}
			
			for(int i=1; i<2; i++)
			{RES3=X3*RES3;}
			
			Y=5*RES1+2*RES2+3*RES3+7;
			System.out.println("El resultado es:" +Y);
			break;
		case"n":
			System.out.println("El valor de X sera el predeterminado");
			Y=5*1+2*1+3*1+7;
			System.out.println("El resultado es:" +Y);
			break;
			default:
				System.out.println("La opcion que has elegido es invalida");
			
			
			
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
