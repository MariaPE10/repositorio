package practica4;

public class Array2 {

	/**
	 * M�todo que crea un array entre un m�ximo y un m�nimo. Y una longitud que le especifiquemos.
	 * @author Maria
	 * @param longitud: extensi�n del array.
	 * @param minimo: valor m�nimo que pueden tener los valores del array.
	 * @param maximo: valor m�ximo que pueden tener los valores del array.
	 * @return
	 */
	public static int[] creaArray(int longitud, int minimo, int maximo) {
		int array[] = new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()* (maximo-minimo) +  minimo);
		}
		
		return array;
	}
	
	/**
	 * M�todo que recibe un array y lo imprime.
	 * @author Maria
	 * @param array
	 */
	public static void imprimeArray(int array[]) {
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
	
	/**
	 * M�todo que recibe un array como par�metro y averigua el valor menor y mayor de dicho array.
	 * Y los imprime en pantalla.
	 * @author Maria
	 * @param array
	 */
	public static void menor_MayorArray(int array[]) {
        int mayor, menor; 
        
        mayor = array[0];
        menor = array[0];

        for (int i = 1; i<array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        
        System.out.println("El valor menor es: " + menor);
        System.out.println("El valor mayor es: " + mayor);
        
	}
	
	/**
	 * M�todo que recibe un array como par�metro y suma los valores pares e impares de dicho array.
	 * Y los imprime en pantalla.
	 * @param array
	 */
    public static void par_ImparArray(int array[]) {    
        int sumaPar = 0, sumaImpar = 0;
        
        for (int i = 0; i< array.length; i++) {
            if (array[i] % 2 == 0) { //es par
                sumaPar += array[i];
            }
            else { //es impar
                sumaImpar += array[i];
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPar);
        System.out.println("La suma de los numeros impares es: " + sumaImpar);
    }
    
}

