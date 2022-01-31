package orientadoObjeto;

public class paciente {

	// ATRIBUTOS
	String nome;
	int idade;
	String rg;

	// METODOS
	public void showRg() {
		System.out.println("O RG do paciente é: " + this.rg);
	}

	public void showNome() {
		System.out.println("O Nome do paciente é: " + this.nome);
	}

	public void showIdade() {
		System.out.println("A idade do paciente é: " + this.idade);
	}

	public void showPaciente() {
		System.out.println("O Nome do paciente é: " + this.rg);
		System.out.println("A idade do paciente é: " + this.idade);
		System.out.println("O RG do paciente é: " + this.rg);
	}

}
