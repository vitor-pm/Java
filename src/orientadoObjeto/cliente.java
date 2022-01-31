package orientadoObjeto;

public class cliente {

	// ATRIBUTOS
	String nome;
	int idade;
	String rg;
	String cpf;
	boolean ativo;

	// METODOS
	public void showRg() {
		System.out.println("O RG do cliente é: " + this.rg);
	}

	public void showCpf() {
		System.out.println("O CPF do cliente é: " + this.cpf);
	}

	public void showNome() {
		System.out.println("O Nome do cliente é: " + this.nome);
	}

	public void showIdade() {
		System.out.println("A idade do cliente é: " + this.idade);
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
		System.out.println("O Nome do cliente é: " + this.rg);
		System.out.println("A idade do cliente é: " + this.idade);
		System.out.println("O RG do cliente é: " + this.rg);
		System.out.println("O CPF do cliente é: " + this.cpf);
		System.out.println("Cliente Ativo: " + this.ativo);
	}

}
