package Guia1P3;

import java.util.Scanner;

public class EJERC29 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int n1, n2, d;
		
		System.out.println("ingrese en primer valor");
		n1=tc.nextInt();
		System.out.println("ingrese el segundo valor");
		n2=tc.nextInt();
		
		if(n1<n2) {
			d=n2-n1;
			System.out.println("la diferencia es:"+d);
		}
		
		else if(n2<n1) {
			d=n1-n2;
			System.out.println("la diferencia eds:"+d);
		}
		
		
	}

}
