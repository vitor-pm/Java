package Introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double px1,py1,px2,py2, d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o X do ponto um: ");
		px1 = scan.nextDouble();
				
		System.out.println("Digite o Y do ponto um: ");
		py1 = scan.nextDouble();
		
		System.out.println("Digite o X do ponto dois: ");
		px2 = scan.nextDouble();
		
		System.out.println("Digite o Y do ponto dois: ");
		py2 = scan.nextDouble();
		
		scan.close();
		
		d = Math.sqrt( (Math.pow (px2-px1,2)) + (Math.pow(py2 - py1, 2)) );
		
		System.out.println("A distância entre os pontos é de: "+d);
		
	}

}
