package orientadoObjeto;

public class contaInfo {

	public static void main(String[] args) {

		contaBancaria c1 = new contaBancaria();

		c1.nome = "Vitor";
		c1.idade = 20;
		c1.rg = "789456123";
		c1.cpf = "963258741";
		c1.saldo = 10000000;

		c1.ativarCliente();

		c1.showCliente();
		
	}

}
