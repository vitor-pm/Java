package Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasTotal;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite quantos anos a pessoa tem: ");
		anos = scan.nextInt();
		
		System.out.println("Digite quantos meses a pessoa tem: ");
		meses = scan.nextInt();
		
		System.out.println("Digite quantos dias a pessoa tem: ");
		dias = scan.nextInt();
		
		scan.close();
		
		diasTotal = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("A pessoa ja viveu "+diasTotal+" dias.");
	}

}
