/*
 * Crea una clase llamara ManipularArreglo
crea un array con los siguientes n�meros enteros:
1, 6, 45, 53, 80, 102, 145, 326, 450, 892

Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total, la suma de los n�meros pares y la suma de los n�meros impares.
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
		System.out.println("La suma total de los n�meros es: " + sumTotal);
		System.out.println("La suma de los n�meros pares es: " + sumPar);
		System.out.println("La suma de los n�meros impares es: " + sumImpar);
	}

}
