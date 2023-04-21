package guia1;

import java.util.Scanner;

public class EJERC7 {

	public static void main(String[] args) {String sel=null;
	Scanner tc=new Scanner(System.in);
	float F,C;
	
	System.out.println("\"elija cual sera su convercion de grados\"\r\n"
			+ "\n Celcius a Fahrenheit:1"
			+ "\n Fahrenheit a Celcius:2");
	sel=tc.next();
	
	switch(sel) {
	case"1":
		System.out.println("Ingrese los grados celcius:");
		C=tc.nextFloat();
		F=(C*9/5)+32;
		
		System.out.println(C+"Celcius="+F+"Fahrenheit");
		break;
		
	case"2":
		
		System.out.println("ingrese los grados Fahrenheit:");
		F=tc.nextFloat();
		C=(F-32)*5/9;
		
		System.out.println(F+"Fahrenheit="+C+"Celcius");
		break;
		default:
			System.out.println("La opcion que has elejido es invalida");
		
			
			
			
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
