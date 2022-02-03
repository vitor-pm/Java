package collections;

public class produto {

	private String nome;
	private float valor;
	private int qtd;

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public produto(String nome, float valor, int qtd) {
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}
	
	public String toString() {
		return "Nome: "+this.nome + " | Valor:" + this.valor + " | Quantidade: " + this.qtd;
	}

}
