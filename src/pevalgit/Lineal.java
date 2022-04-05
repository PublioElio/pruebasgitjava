package pevalgit;

/**
 * Esta clase realiza una busqueda lineal en una lista
 * 
 * @author Adriano Díaz
 * @date 05/04/2022
 */
public class Lineal {
	
	/**
	 * Este método recibe un array y busca un dato de forma lineal
	 * @param arreglo donde buscar
	 * @param dato elemento que busca
	 * @return la posición del elemento si lo encuentra
	 */
	public static int busquedaLineal(int[] arreglo, int dato) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == dato) {
				return i;
			}
		}
		return -1;
	}
}
