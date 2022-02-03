package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class lista {

	public static void main(String[] args) {

		ArrayList<produto> produtos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		int opcao = 5;

		do {
			System.out.println("Digite o que deseja fazer: ");
			System.out.println("1 - Inserir item no estoque.");
			System.out.println("2 - Excluir item do estoque.");
			System.out.println("3 - Atulizar item no estoque.");
			System.out.println("4 - Mostrar todo estoque.");
			System.out.println("5 - Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				String nome;
				float valor;
				int qtd;

				System.out.println("Selecionou 1 inserir produto.");
				System.out.printf("Digite o nome do produto: ");
				nome = scan.next();

				System.out.printf("Digite o valor do produto: ");
				valor = scan.nextFloat();

				System.out.printf("Digite a quantidade disponivel do produto: ");
				qtd = scan.nextInt();

				produto p1 = new produto(nome, valor, qtd);
				produtos.add(p1);

				opcao = 0;

				break;
			case 2:
				int numProd;
				System.out.println("Selecionou excluir item.");

				for (int i = 0; i < produtos.size(); i++) {
					System.out.println((i + 1) + " - " + produtos.get(i));
				}
				System.out.println("Qual produto deseja excluir.");
				numProd = scan.nextInt();

				produtos.remove(--numProd);

				opcao = 0;

				break;
			case 3:
				String nomeAtt;
				float valorAtt;
				int qtdAtt;

				int numProdAtt;
				System.out.println("Selecionou Atualizar item.");

				for (int i = 0; i < produtos.size(); i++) {
					System.out.println((i + 1) + " - " + produtos.get(i));
				}
				System.out.println("Qual produto deseja Atualizar.");
				numProdAtt = scan.nextInt();

				System.out.printf("Digite o nome do produto: ");
				nomeAtt = scan.next();

				System.out.printf("Digite o valor do produto: ");
				valorAtt = scan.nextFloat();

				System.out.printf("Digite a quantidade disponivel do produto: ");
				qtdAtt = scan.nextInt();

				produto p1Att = new produto(nomeAtt, valorAtt, qtdAtt);
				produtos.set(--numProdAtt, p1Att);
				opcao = 0;

				break;
			case 4:
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}

				opcao = 0;

				break;
			case 5:
				System.out.println("Selecionou sair. Tem certeza? S/N");
				String sair = scan.next();
				if (sair == "S" || sair == "s") {
					System.out.println("Programa encerrado.");
				} else {
					opcao = 0;
				}

				break;

			default:

				break;
			}

		} while (opcao != 5);

		scan.close();

	}

}
