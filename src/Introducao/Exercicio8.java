package Introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica do carro: ");
		custoFabrica = scan.nextDouble();
		
		scan.close();
		
		custoConsumidor = custoFabrica + custoFabrica*0.28;
		
		custoConsumidor = custoConsumidor + custoConsumidor*0.45;
		
		System.out.println("O custo do carro ao consumidor é de R$:"+custoConsumidor);
	}

}
