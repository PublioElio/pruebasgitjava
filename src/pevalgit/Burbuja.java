package pevalgit;

/**
 * 
 * Esta clase realiza una ordenación de una lista por el método de la burbuja
 * 
 * @author Adriano Díaz Benítez
 * @Date 05/04/2022
 *
 */

public class Burbuja {
	
	/**
	 * Este método ordena una lista por el método de la burbuja
	 * 
	 * @param lista la lista a ordenar
	 * @return devuelve la lista ordenada
	 */

	public static int[] burbuja(int lista[]) {
		int cuentaintercambios = 0;
		// Usamos un bucle anidado, saldra cuando este ordenado el array
		for (boolean ordenado = false; !ordenado;) {
			for (int i = 0; i < lista.length - 1; i++) {
				if (lista[i] > lista[i + 1]) {
					// Intercambiamos valores
					int variableauxiliar = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = variableauxiliar;
					// indicamos que hay un cambio
					cuentaintercambios++;
				}
			}
			// Si no hay intercambios, es que esta ordenado.
			if (cuentaintercambios == 0) {
				ordenado = true;
			}
			// Inicializamos la variable de nuevo para que empiece a contar de
			// nuevo
			cuentaintercambios = 0;
		}
		return (lista);
	}

}
