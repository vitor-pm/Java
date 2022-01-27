package repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero:");
			numero = scan.nextInt();
			soma = soma + numero;
			
		}while (numero != 0);
		
		scan.close();
		
		System.out.println("Voce digitou 0.");
		System.out.println("A soma dos numeros é: "+soma);
			
		}
	
		

}
