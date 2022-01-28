package vetormatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] dado = new int[10];
		int maior = 0, ocorrencia = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < dado.length; i++) {
			System.out.println("Digite o valor do dado: ");
			dado[i] = scan.nextInt();
			if (maior < dado[i]) {
				maior = dado[i];
			}
		}
		
		scan.close();
		
		for (int i : dado) {
			if (maior == i) {
				ocorrencia++;
			}
		}
		
		System.out.println("Os numeros do dado foram:");
		for (int i : dado) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nO maior numero foi " + maior + ", que apareceu "+ ocorrencia + " vezes.");
		
		

	}

}
