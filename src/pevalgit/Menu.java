package pevalgit;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		boolean misterio = true;
		do {
			mostrarPorConsola("Elija una opción: \n 1. opción Binaria\n 2. opción Lineal\n 999. salir\n");
			int seleccion = read();
			switch (seleccion) {
			case 1:
				mostrarPorConsola("Ha elegido la opción Binaria");
				break;
			case 2:
				mostrarPorConsola("Ha elegido la opción Lineal");
				break;
			case 999:
				misterio = false;
				mostrarPorConsola("Adiós");
				break;
			default:
				mostrarPorConsola("Elija una opción válida: ");
			}

		} while (misterio);

	}

	private static int read() {
		Scanner sc = new Scanner(System.in);
//			directamente retorno el Scanner sin asignar 
		return sc.nextInt();
	}

	private static void mostrarPorConsola(String text) {
		System.out.println(text);
	}

}
