package Introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a,b,c,r,s,d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a = scan.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		b = scan.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		c = scan.nextDouble();
		
		scan.close();
		
		r = Math.pow(a + b,2);
		s = Math.pow(c + b,2);
		
		d= (r+s)/2;
		
		System.out.println("O valor da equação é: "+d);

	}

}
