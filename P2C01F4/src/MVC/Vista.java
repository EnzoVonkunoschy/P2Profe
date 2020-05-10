package MVC;

import java.util.Scanner;

public class Vista {
	
	public static void escribirAtributo(String atributo, String valor) {
		System.out.println(atributo+" : "+valor);
		
	}

	public static String leerAtributo(String atributo) {
		// TODO Auto-generated method stub
		Scanner Leer = new Scanner(System.in);		
		System.out.print("Ingrese el "+atributo);
		String atribTmp = Leer.next();
		Leer.close();
		return atribTmp;	
	}
}
