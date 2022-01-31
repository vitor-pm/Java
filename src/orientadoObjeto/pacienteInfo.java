package orientadoObjeto;

public class pacienteInfo {

	public static void main(String[] args) {
		paciente p1 = new paciente();
		
		p1.nome = "Vitor";
		p1.idade = 20;
		p1.rg = "789456123";

		p1.showPaciente();

	}

}
