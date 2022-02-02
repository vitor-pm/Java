package herança;

public class animais {

	public static void main(String[] args) {

		cachorro dog = new cachorro();
		cavalo horse = new cavalo();
		preguica lazy = new preguica();

		dog.setIdade(7);
		dog.setNome("toto");
		dog.setSom(true);

		horse.setNome("alazao");
		horse.setIdade(7);
		horse.setSom(true);

		lazy.setNome("sossego");
		lazy.setIdade(3);
		lazy.setSom(true);

		dog.emitirSom();
		horse.emitirSom();
		lazy.emitirSom();

		animal[] animais = new animal[3];
		animais[0] = dog;
		animais[1] = horse;
		animais[2] = lazy;

	}

}
