package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numeros[];
		numeros = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = scan.nextInt();
		}
		
		scan.close();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("O numero "+ numeros[i] + " é par.");
			}
			else {
				System.out.println("O numero "+ numeros[i] + " é impar.");
			}
		}

	}

}
