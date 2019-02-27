package practica4;


public class Arrays {

	/**
	 * M�todo que crea un array con la longitud que le especifique el usuario y lo rellena con valores entre los dos l�mites,
	 * tambi�n indicados por el usuario.
	 * @author Maria
	 * @param longitud: longitud del array.
	 * @param minimo: valor m�nimo que podr� tomar nuestro array.
	 * @param maximo: valor m�ximo que podr� tomar nuestro array.
	 * @return
	 */
	public static int[] rellenarArray(int longitud, int minimo, int maximo) {
		int array[] = new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()* (maximo-minimo) +  minimo);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		return array;
	} 
	 
	/**
	 * Metodo que recibe un array y lo imprime.
	 * @param array
	 */
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
	
	/**
	 * M�todo que devuelve la suma de los valores de un array que recibe como par�metro.
	 * @author Maria
	 * @param array
	 * @return
	 */
	public static int sumaArray(int array[]) {
        int suma = array[0];
        
        for (int i = 1; i<array.length; i++) {
            suma+=array[i];
        }
        
        return suma;
	}
}
