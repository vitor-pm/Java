package repeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double sobra;
		
		for (int i = 1000; i < 2000; i++) {
			sobra = i%11;
			
			if(sobra == 5) {
				System.out.println(i+ " divididor por 11 sobra 5.");
			}
		}

	}

}
