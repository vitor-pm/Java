package orientadoObjeto;

public class eletronico {
	// ATRIBUTOS
	String nome;
	String marca;
	int voltagem;
	boolean bivolt;

	// METODOS
	public void showNome() {
		System.out.println("O nome do eletronico �: " + this.nome);
	}

	public void showMarca() {
		System.out.println("A marca do eletronico �: " + this.marca);
	}

	public void showVoltagem() {
		System.out.println("A voltagem do eletronico �: " + this.voltagem);
	}

	public void showEletronico() {
		System.out.println("O nome do eletronico �: " + this.nome);
		System.out.println("A marca do eletronico �: " + this.marca);
		System.out.println("A voltagem do eletronico �: " + this.voltagem);
		System.out.println("O eletronico � bivolt: " + this.bivolt);
	}

}
