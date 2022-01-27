package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		System.out.println("Programa Iniciado informe -99 para finalizar.");
		
		Scanner scan = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Informe a idade da pessoa: ");
			idade = scan.nextInt();
			
			if(idade < 21 && idade != -99) {
				menos21 ++;
			}else if (idade > 50) {
				mais50 ++;
			}
		}
		
		scan.close();
		
		System.out.println("Foi informado " + menos21 + " pessoas com menos de 21.");
		System.out.println("Foi informado " + mais50 + " pessoas com mais de 50.");

	}

}
