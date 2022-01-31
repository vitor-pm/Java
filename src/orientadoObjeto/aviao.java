package orientadoObjeto;

public class aviao {
	// ATRIBUTOS
	String dono;
	int anoFabri;
	String matricula;
	String modelo;

	// METODOS
	public void showDono() {
		System.out.println("O dono do avião é: " + this.dono);
	}

	public void showAno() {
		System.out.println("O ano de fabricação do avião é: " + this.anoFabri);
	}

	public void showMatricula() {
		System.out.println("A matricula do avião é: " + this.matricula);
	}

	public void showModelo() {
		System.out.println("O modelo do avião é: " + this.modelo);
	}

	public void showAviao() {
		System.out.println("O dono do avião é: " + this.dono);
		System.out.println("O ano de fabricação do avião é: " + this.anoFabri);
		System.out.println("A matricula do avião é: " + this.matricula);
		System.out.println("O modelo do avião é: " + this.modelo);
	}

}
