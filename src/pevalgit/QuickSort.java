package pevalgit;

/**
 * Clase que reordena de forma rápida una lista
 * @author Adriano Díaz Benítez
 * @date 05/04/2022
 *
 */

public class QuickSort {

	/**
	 * 
	 * Este método ordena una lista de forma rápida
	 * @param lista1 la lista a ordenar
	 * @param izq elemento más a la izquierda
	 * @param der elemento más a la derecha
	 * @return la lista ordenada
	 */
	public static int[] quicksort(int lista1[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = lista1[(i + j) / 2];
		do {
			while (lista1[i] < pivote) {
				i++;
			}
			while (lista1[j] > pivote) {
				j--;
			}
			if (i <= j) {
				int aux = lista1[i];
				lista1[i] = lista1[j];
				lista1[j] = aux;
				i++;
				j--;
			}
		} while (i <= j);
		if (izq < j) {
			quicksort(lista1, izq, j);
		}
		if (i < der) {
			quicksort(lista1, i, der);
		}
		return (lista1);
	}

}
