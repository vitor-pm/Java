package orientadoObjeto;

public class patinete {

	// ATRIBUTOS
	String marca;
	boolean eletrico;
	String Cor;

	// METODOS
	public void showMarca() {
		System.out.println("A marca do patinete é: " + this.marca);
	}

	public void showEletrico() {
		System.out.println("O patinete é eletrico: " + this.eletrico);
	}

	public void showCor() {
		System.out.println("A cor do patinete é: " + this.Cor);
	}

	public void showPatinete() {
		System.out.println("A marca do patinete é: " + this.marca);
		System.out.println("A cor do patinete é: " + this.Cor);
		System.out.println("O patinete é eletrico: " + this.eletrico);
	}

}
