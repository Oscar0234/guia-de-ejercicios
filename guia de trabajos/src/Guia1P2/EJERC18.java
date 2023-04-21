package Guia1P2;

import java.util.Scanner;

public class EJERC18 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		System.out.println("Ingrese el numero que desea invertir");
		int N=tc.nextInt();
		
		if(N > 999 & N <10000) {
			
			int a = N /1000;
			int b = N - (a*1000);
			int c= b / 100;
			int d = b -(c*100);
			int e = d/10;
			int f = d- (e*10);
			int g = (f*1000)+(e*100)+(c*10)+a;
			System.out.println("este es el numero invertido:"+g);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
