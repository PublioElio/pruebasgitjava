package pevalgit;

/**
 * Esta clase busca elementos mediante la búsqueda binaria
 * @author Adriano Díaz
 * @date 05/04/2022
 *
 */

public class Binaria {

	/**
	 * Método que realiza la búsqueda binaria
	 * @param vector dónde tiene que buscar
	 * @param dato el dato que busca
	 * @return la posición del dato encontrado
	 */
	public static int busquedaBinaria(int vector[], int dato) {
		int n = vector.length;
		int centro, inf = 0, sup = n - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (vector[centro] == dato)
				return centro;
			else if (dato < vector[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
		}
		return -1;
	}

	public static boolean modificarValor(int vector[], int nuevoValor, int posicion) {
		if ((posicion < 0) || (posicion >= vector.length)) {
			throw new ArrayIndexOutOfBoundsException("Fuera de rango");
		} else {
			vector[posicion] = nuevoValor;
			return true;
		}
	}

}
