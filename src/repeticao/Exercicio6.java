package repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int numero, multiploTres = 0;
		double media = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Programa iniciado, para finalizar informe o numero 0.");

		do {
			System.out.println("Informe um numero: ");
			numero = scan.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				media = media + numero;
				multiploTres++;

			}

		} while (numero != 0);

		media = media / multiploTres;

		scan.close();

		System.out.println("A media dos multiplos de 3 digitados é: " + media);

		System.out.println("Programa encerrado");
	}

}
