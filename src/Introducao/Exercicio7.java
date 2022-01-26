package Introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a,b,c,d,e,f,x,y;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		a = scan.nextDouble();
		
		System.out.println("Insira o valor B: ");
		b = scan.nextDouble();
		
		System.out.println("Insira o valor C: ");
		c = scan.nextDouble();
		
		System.out.println("Insira o valor D: ");
		d = scan.nextDouble();
		
		System.out.println("Insira o valor E: ");
		e = scan.nextDouble();
		
		System.out.println("Insira o valor F: ");
		f = scan.nextDouble();
		
		scan.close();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X é "+ x + " e o valor de Y é "+ y);
		
		/* PROVA REAL
		 
		 double realC,realF;
		 
		realC=(a*x)+(b*y);
		
		realF=(d*x)+(e*y);
		
		System.out.println("real c: "+ realC+ "real f: " + realF);
		
		*/
		
	}

}
