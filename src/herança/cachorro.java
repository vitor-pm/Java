package herança;

public class cachorro extends animal {

	public void correr() {
		System.out.println("O cachorro esta correndo.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo.");
	}
	
	

}
