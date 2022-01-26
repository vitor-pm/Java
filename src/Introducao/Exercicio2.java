package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasTotal;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite quantos dias a pessoa ja viveu: ");
		diasTotal = scan.nextInt();
		
		scan.close();
		
		anos = diasTotal / 365;
		
		meses = (diasTotal % 365) / 30;
		
		dias = (diasTotal % 365) % 30;
		
		System.out.println("A pessoa ja viveu " + anos + " anos, "+meses+" meses e "+dias+" dias.");

	}

}
