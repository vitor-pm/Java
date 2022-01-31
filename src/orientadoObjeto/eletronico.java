package orientadoObjeto;

public class eletronico {
	// ATRIBUTOS
	String nome;
	String marca;
	int voltagem;
	boolean bivolt;

	// METODOS
	public void showNome() {
		System.out.println("O nome do eletronico é: " + this.nome);
	}

	public void showMarca() {
		System.out.println("A marca do eletronico é: " + this.marca);
	}

	public void showVoltagem() {
		System.out.println("A voltagem do eletronico é: " + this.voltagem);
	}

	public void showEletronico() {
		System.out.println("O nome do eletronico é: " + this.nome);
		System.out.println("A marca do eletronico é: " + this.marca);
		System.out.println("A voltagem do eletronico é: " + this.voltagem);
		System.out.println("O eletronico é bivolt: " + this.bivolt);
	}

}
