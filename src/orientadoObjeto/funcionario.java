package orientadoObjeto;

public class funcionario {
	// ATRIBUTOS
	String nome;
	int idade;
	String rg;
	String cpf;
	boolean ativo;
	double salario;

	// METODOS
	public void showRg() {
		System.out.println("O RG do funcionario é: " + this.rg);
	}

	public void showSalario() {
		System.out.println("O salario do funcionario é: " + this.salario);
	}

	public void showCpf() {
		System.out.println("O CPF do funcionario é: " + this.cpf);
	}

	public void showNome() {
		System.out.println("O Nome do funcionario é: " + this.rg);
	}

	public void showIdade() {
		System.out.println("A idade do funcionario é: " + this.idade);
	}

	public void ativarFuncionario() {
		this.ativo = true;
		System.out.println("Funcionario Ativado.");
	}

	public void desativarFuncionario() {
		this.ativo = false;
		System.out.println("Funcionario Desativado.");
	}

	public void showFuncionario() {
		System.out.println("O Nome do funcionario é: " + this.rg);
		System.out.println("A idade do funcionario é: " + this.idade);
		System.out.println("O RG do funcionario é: " + this.rg);
		System.out.println("O CPF do funcionario é: " + this.cpf);
		System.out.println("O salario do funcionario é: " + this.salario);
		System.out.println("Cliente Ativo: " + this.ativo);
	}

}
