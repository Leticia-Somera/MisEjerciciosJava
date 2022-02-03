
public class Arreglos {
	public static void main(String[] args) {
		//En Java los arreglos almacenan solo un tipo de dato
		//Debemos especificar el número de elementos que va a contener el arreglo
		
		//Opción 1 para declarar un arreglo
		int numeros[]; //creamos la variable
		numeros = new int[4]; //creamos el arreglo
		
		//Opción 2 para declarar un arreglo
		String[] nombres = new String[4]; //este arreglo contiene 4 elementos y sus posiciones son [0, 1, 2, 3]
		
		//Opción 3 para declarar un arreglo (array literal)
		String []nombreFrutas = new String[]{"Manzana", "Plátano", "Uva", "Pera"};
		
		//para ingresar un nuevo elemento al arreglo numeros
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;			
		
		//para ingresar un nuevo elemento al arreglo nombres
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";		
		
		System.out.println(numeros[0]); //esto nos muestra el primer elemento del array numeros
		System.out.println(numeros); //esto NO nos muestra el contenido del array numeros
		
		for(int i = 0; i < numeros.length; i++) {
			//en arrays, length es una propiedad para numeros, pero un método para los strings
			System.out.println("Elemento del array \'números\':" + numeros[i]);
			System.out.println("Elemento del array \'nombres\':" + nombres[i]);
			System.out.println("Elemento del array \'frutas\':" + nombreFrutas[i]);
			System.out.println("-----------------");
		}
		
		
		
		
	}

}
