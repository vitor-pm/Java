package orientadoObjeto;

public class eletronicoInfo {

	public static void main(String[] args) {

		eletronico e1 = new eletronico();

		e1.nome = "Televisao";
		e1.marca = "Samsung";
		e1.voltagem = 220;
		e1.bivolt = false;


		e1.showEletronico();

	}

}
