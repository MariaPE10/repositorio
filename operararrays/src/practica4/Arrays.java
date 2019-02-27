package practica4;

public class Arrays {

	/**
	 * Método que crea un array entre un máximo y un mínimo. Y una longitud que le especifiquemos.
	 * @author Maria
	 * @param longitud: extensión del array.
	 * @param minimo: valor mínimo que pueden tener los valores del array.
	 * @param maximo: valor máximo que pueden tener los valores del array.
	 * @return
	 */
	public static int[] rellenarArray(int longitud, int minimo, int maximo) {
		int array[] = new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()* (maximo-minimo) +  minimo);
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
	 * Método que devuelve la suma de los valores de un array que recibe como parámetro.
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
	
	/**
	 * Método main que hace uso de todos los métodos de la clase.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[];
		array = rellenarArray(10, 1, 20);
		imprimirArray(array);
		int suma = sumaArray(array);
		System.out.println("La suma de los valores del array es:" + suma);
	}

}
