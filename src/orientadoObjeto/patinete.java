package orientadoObjeto;

public class patinete {

	// ATRIBUTOS
	String marca;
	boolean eletrico;
	String Cor;

	// METODOS
	public void showMarca() {
		System.out.println("A marca do patinete �: " + this.marca);
	}

	public void showEletrico() {
		System.out.println("O patinete � eletrico: " + this.eletrico);
	}

	public void showCor() {
		System.out.println("A cor do patinete �: " + this.Cor);
	}

	public void showPatinete() {
		System.out.println("A marca do patinete �: " + this.marca);
		System.out.println("A cor do patinete �: " + this.Cor);
		System.out.println("O patinete � eletrico: " + this.eletrico);
	}

}
