package orientadoObjeto;

public class contaBancaria {
	// ATRIBUTOS
	String nome;
	int idade;
	String rg;
	String cpf;
	boolean ativo;
	double saldo;

	// METODOS
	public void showRg() {
		System.out.println("O RG do cliente �: " + this.rg);
	}

	public void showCpf() {
		System.out.println("O CPF do cliente �: " + this.cpf);
	}

	public void showNome() {
		System.out.println("O Nome do cliente �: " + this.rg);
	}

	public void showIdade() {
		System.out.println("A idade do cliente �: " + this.idade);
	}

	public void showSaldo() {
		System.out.println("O saldo do cliente �: " + this.saldo);
	}

	public void ativarCliente() {
		this.ativo = true;
		System.out.println("Cliente Ativado.");
	}

	public void desativarCliente() {
		this.ativo = false;
		System.out.println("Cliente Desativado.");
	}

	public void showCliente() {
		System.out.println("O Nome do cliente �: " + this.rg);
		System.out.println("A idade do cliente �: " + this.idade);
		System.out.println("O RG do cliente �: " + this.rg);
		System.out.println("O CPF do cliente �: " + this.cpf);
		System.out.println("O saldo do cliente �: " + this.saldo);
		System.out.println("Cliente Ativo: " + this.ativo);
	}
}
