package vetormatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int[] vetor = new int[5];
		int maior = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = scan.nextInt();
			
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		scan.close();
		
		System.out.print("Números informados: ");
		for (int i : vetor) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nO maior numero é: " + maior);

	}

}
