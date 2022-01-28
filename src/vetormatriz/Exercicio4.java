package vetormatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int[][] numeros = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		int diagonal = 3;

		Scanner scan = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Digite um numero para matriz: ");
				numeros[linha][coluna] = scan.nextInt();
				soma = soma + numeros[linha][coluna];
			}
		}
		
		scan.close();
		System.out.print("\n");
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna]+"\t");
				if(diagonal == 3) {
					diagonal = 6;
					somaDiagonal = somaDiagonal + numeros[linha][coluna];
				}
				else {
					diagonal --;
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\n A soma dos valores da matriz é: "+soma);
		System.out.println("\n A soma dos valores da diagonal é: "+somaDiagonal);

	}

}
