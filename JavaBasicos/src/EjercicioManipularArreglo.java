/*
 * Crea una clase llamara ManipularArreglo
crea un array con los siguientes números enteros:
1, 6, 45, 53, 80, 102, 145, 326, 450, 892

Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.
 */
public class EjercicioManipularArreglo {
	public static void main(String[] args) {
		
		int []numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int sumTotal = 0, sumPar = 0, sumImpar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			
			sumTotal += numeros[i];
			
			if((numeros[i] % 2) ==0) {
				sumPar += numeros[i];				
			} else {
				sumImpar += numeros[i];				
			}		
		}
		System.out.println("La suma total de los números es: " + sumTotal);
		System.out.println("La suma de los números pares es: " + sumPar);
		System.out.println("La suma de los números impares es: " + sumImpar);
	}

}
