package vectoresbasico;

public class LibretaBasica {

	String nombres[] = new String[10];
	
	public void agregarAlibreta(String nom, int lugar) {
		this.nombres[lugar] = nom;
	}
	
	public void listarLibreta() {

		for(int i=0;i<10;i++) {
			System.out.println(i+") --> "+nombres[i]);
		}
	}

}
