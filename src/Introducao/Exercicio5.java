package Introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int nota1,nota2,nota3,media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextInt();
				
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextInt();

		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextInt();
		
		scan.close();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("A media do aluno é: "+media);

	}

}
