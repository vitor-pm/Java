package orientadoObjeto;

public class clienteInfo {

	public static void main(String[] args) {
		cliente c1 = new cliente();

		c1.nome = "Vitor";
		c1.idade = 20;
		c1.rg = "789456123";
		c1.cpf = "963258741";

		c1.ativarCliente();

		c1.showCliente();
	}
}
