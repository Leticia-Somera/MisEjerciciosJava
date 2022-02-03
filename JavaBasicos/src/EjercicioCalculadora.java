import java.util.Scanner;

public class EjercicioCalculadora {
	public static void main(String[] args) {
		/*
		 * Pedir al usuario 2 numeros por consola y pregunarle qu� desea realizar:
		 * 1) Suma
		 * 2) Resta
		 * 3) Divisi�n
		 * 4) Multiplicaci�n
		 * 
		 * y despu�s imprimir el resultado
		 */
		
		System.out.println("Introduce el primer d�gito:");
		Scanner n1 = new Scanner(System.in);
		double num1 = n1.nextDouble();
		
		System.out.println("Introduce el segundo d�gito:");
		Scanner n2 = new Scanner(System.in);
		double num2 = n2.nextDouble();
		
		System.out.println("Escribe el n�mero de la operaci�n que deseas realizar: \n1) Suma \n2) Resta \n3) Divisi�n \n4) Multiplicaci�n");
		
		Scanner op = new Scanner(System.in);
		int operacion = op.nextInt();
		
		switch(operacion) {
			case 1:
				double suma = num1 + num2;
				System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
				break;
			case 2:
				double resta = num1 - num2;
				System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resta);
				break;
			case 3:
				double division = num1 / num2;
				System.out.println("La divisi�n de " + num1 + " entre " + num2 + " es: " + division);
				break;
			case 4:
				double mult = num1 * num2;
				System.out.println("La multiplicaci�n de " + num1 + " y " + num2 + " es: " + mult);
				break;
			default:
				System.out.println("Opci�n no v�lida");
		}
	}

}
