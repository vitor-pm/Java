package orientadoObjeto;

public class paciente {

	// ATRIBUTOS
	String nome;
	int idade;
	String rg;

	// METODOS
	public void showRg() {
		System.out.println("O RG do paciente �: " + this.rg);
	}

	public void showNome() {
		System.out.println("O Nome do paciente �: " + this.nome);
	}

	public void showIdade() {
		System.out.println("A idade do paciente �: " + this.idade);
	}

	public void showPaciente() {
		System.out.println("O Nome do paciente �: " + this.rg);
		System.out.println("A idade do paciente �: " + this.idade);
		System.out.println("O RG do paciente �: " + this.rg);
	}

}
