package guia1;

import java.util.Scanner;

public class AreaRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		int b, h, A;
		
		System.out.println("ingrese la base del rectangulo");
		b=tc.nextInt();
		System.out.println("ingrese la altura del rectangulo");
		h=tc.nextInt();
		
		A=b*h;
		
		System.out.println("El area de el rectangulo es:" +b+"x"+h+"="+A);
		
		
		
		
		
		

	}

}
