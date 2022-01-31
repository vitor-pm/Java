package orientadoObjeto;

public class aviaoInfo {

	public static void main(String[] args) {
		
		aviao aviao = new aviao();

		aviao.anoFabri = 1990;
		aviao.dono = "TAM";
		aviao.matricula = "PP-AAJ";
		aviao.modelo = "boeing";

		aviao.showAviao();

	}

}
