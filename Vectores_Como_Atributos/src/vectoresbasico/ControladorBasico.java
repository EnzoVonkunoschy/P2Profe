package vectoresbasico;

public class ControladorBasico {

	public static void main(String[] args) {

		LibretaBasica miLibreta = new LibretaBasica();
		
		miLibreta.agregarAlibreta("Enzo", 3);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Jerónimo", 5);
		miLibreta.listarLibreta();
		/*miLibreta.agregarAlibreta("Pedro", 12);
		miLibreta.listarLibreta();*/
		

	}

}
