package Introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, segundosTotal;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite quantos segundos o evento durará ao todo: ");
		segundosTotal = scan.nextInt();
		
		scan.close();
		
		horas = segundosTotal / 3600;
		
		minutos = (segundosTotal % 3600) / 60;
		
		segundos = (segundosTotal % 3600) % 60;
		
		System.out.println("O evento durará " + horas + " horas, "+minutos+" minutos e "+segundos+" segundos.");
	}

}
