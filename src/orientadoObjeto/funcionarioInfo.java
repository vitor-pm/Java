package orientadoObjeto;

public class funcionarioInfo {

	public static void main(String[] args) {

		funcionario f1 = new funcionario();

		f1.nome = "Vitor";
		f1.idade = 20;
		f1.rg = "789456123";
		f1.cpf = "963258741";
		f1.salario = 5000;

		f1.ativarFuncionario();

		f1.showFuncionario();

	}

}
