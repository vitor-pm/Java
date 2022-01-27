package repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int sexo, idade, temperamento, total = 1;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int nervosoMais40 = 0, calmasMenos18 = 0;

		Scanner scan = new Scanner(System.in);

		while (total != 151) {

			System.out.println("Pessoa " + total);
			System.out.println("Idade: ");
			idade = scan.nextInt();

			System.out.println("Sexo (1- feminino / 2-masculino / 3-outros)");
			sexo = scan.nextInt();

			System.out.println("Temperamento (1-Calma / 2-nervosa / 3-agressivo)");
			temperamento = scan.nextInt();

			switch (temperamento) {
			case 1:
				pessoasCalmas++;                  // Pessoa Calmas
				if (sexo == 3) {
					outrosCalmos++;               // Outros Calmos 
				}
				if (idade < 18) {
					calmasMenos18++;              // Calmos Menos de 18
				}
				break;

			case 2:
				if (sexo == 1) {
					mulheresNervosas ++;          // Mulheres Nervosas
				}
				if (idade > 40) {
					nervosoMais40 ++;             // Pessoas Nervosas Mais de 40
				}
				break;

			case 3:
				if (sexo == 2) {
					homensAgressivos ++;          // Homens Agressivos
				}
				break;

			default:
				break;
			}

			total++;
		}

		scan.close();
		
		System.out.println("Na empresa há:");
		System.out.println(pessoasCalmas + " pessoas calmas.");
		System.out.println(mulheresNervosas + " mulheres nervosas.");
		System.out.println(homensAgressivos + " homens agressivos.");
		System.out.println(outrosCalmos + " sexo outro calmos.");
		System.out.println(nervosoMais40 + " pessoas nervosas com mais de 40.");
		System.out.println(calmasMenos18 + " pessoas calma com menos de 18.");

	}

}
