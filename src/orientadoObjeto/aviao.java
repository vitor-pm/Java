package orientadoObjeto;

public class aviao {
	// ATRIBUTOS
	String dono;
	int anoFabri;
	String matricula;
	String modelo;

	// METODOS
	public void showDono() {
		System.out.println("O dono do avi�o �: " + this.dono);
	}

	public void showAno() {
		System.out.println("O ano de fabrica��o do avi�o �: " + this.anoFabri);
	}

	public void showMatricula() {
		System.out.println("A matricula do avi�o �: " + this.matricula);
	}

	public void showModelo() {
		System.out.println("O modelo do avi�o �: " + this.modelo);
	}

	public void showAviao() {
		System.out.println("O dono do avi�o �: " + this.dono);
		System.out.println("O ano de fabrica��o do avi�o �: " + this.anoFabri);
		System.out.println("A matricula do avi�o �: " + this.matricula);
		System.out.println("O modelo do avi�o �: " + this.modelo);
	}

}
