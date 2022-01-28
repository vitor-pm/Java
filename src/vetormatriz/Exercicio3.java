package vetormatriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		
		Scanner scan = new Scanner(System.in);
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("Digite um numero para matriz: ");
				N1[linha][coluna] = scan.nextInt();
			}
		}
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("Digite um numero para matriz: ");
				N2[linha][coluna] = scan.nextInt();
			}
		}
		
		scan.close();
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
			}
		}
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		
		System.out.println("N1");
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print(N1[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nN2");
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print(N2[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		
		
		System.out.println("\nM1");
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print(M1[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nM2");
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print(M2[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
