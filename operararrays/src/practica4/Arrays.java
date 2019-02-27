package practica4;

public class Arrays {

	/**
	 * M�todo que crea un array entre un m�ximo y un m�nimo. Y una longitud que le especifiquemos.
	 * @author Maria
	 * @param longitud: extensi�n del array.
	 * @param minimo: valor m�nimo que pueden tener los valores del array.
	 * @param maximo: valor m�ximo que pueden tener los valores del array.
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

	public static void main(String[] args) {
		rellenarArray(10, 1, 20);
		
	}
	
	
}
