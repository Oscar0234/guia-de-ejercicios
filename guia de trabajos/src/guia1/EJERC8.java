package guia1;

import java.util.Scanner;

public class EJERC8 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double A,B,C,b,h,D,E,R1,R2,are;
		
		System.out.println("ingrese la base de el triangulo");
		b=tc.nextInt();
		
		System.out.println("ingrese la altuta de el triangulo");
		h=tc.nextInt();
		
		are=b*h;jaja
		
		System.out.println("el area de el triangulo es:"+are);
		
		C=b/2;D=C;E=h;
		for(int i=1; i<2; i++) 
		{D=D*C;}
		for(int i=1; i<2; i++) 
		{E=E*h;}
		R1=D+E;R2=R1/R1;
		
		A=R2;B=R2;
		
		System.out.println("los lados del triangulo son:"
				+"\nlado A="+A+"lado B="+B+"lado C="+b);
		
		
		
		
		
		
		
		
	}

}
