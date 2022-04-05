package pevalgit;

/**
 * Esta clase contiene un método que ordena una lista de elementos mediante
 * intercambio de posiciones
 * 
 * @author Adriano Díaz
 * @date 05/04/2022
 *
 */

public class Intercambio {

	/**
	 * Este método ordena una lista cambiando las posiciones de sus elementos
	 * @param lista la lista que recibe y hay que ordenar
	 * @return devuelve la lista ordenada
	 */
	public static int[] intercambio(int lista[]) {
		// Usamos un bucle anidado
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					// Intercambiamos valores
					int variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;

				}
			}
		}
		return (lista);
	}

}
