package operadores;
import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritméticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		double c = 10.0;
		int c2 = 32;
		
		
		// suma
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//resta
		System.out.println("El resultado de la resta es: " + (a - b));
		
		//división
		int division = a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division2 = (double) a / b;
		System.out.println("El resultado de la division es: " + division2);
		//por lo menos uno de los datos debe ser de tipo double para que nos represente los decimles corretamente
		//10.0 / 20 = 0.5
		
		//multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);	
		
		//modulo (nos da el residuo de una división)
		double modulo = c2 % c;
		System.out.println("El módulo de la operación es: " + modulo);
		
		// Operador de asignación
		int d = 5, e; //Se inicializan las variables vacias
		e = 6;
		System.out.println(d + " - " + e);	
		
		//Operadores de declaración compuesta
		// +=, -=, /=, %=
		// una operación simplificada
		int f = 0, g = 5;
		f += 5;
		g -= 5;
		System.out.println("Resultado de f: " + f);
		System.out.println("Resultado de g: " + g);
		
		//operadores relacionales
		// == igualdad
		// != diferencia
		//Dan como resultado un valor de tipo boolean
		int h = 15, i = 25;
		String j = "Hola";
		System.out.println(h > i); //false
		System.out.println(i != h); //true
		//System.out.println((string)h != j); // Esto nos da un error porque son variables de diferente tipo (int y string) que no pueden compararse
		
		//Operador unario
		// preasignación ++
		// postasignación --
		
		int k = 0, l = 0;
		k++;
		System.out.println("Valos de k: " + k);
		System.out.println("Valos de l: " +--l);
		
		//Precedencia de operadores
		int operacion = (4 + 5) * 6 / 3;
		System.out.println("El resultado de la operacion es: " + operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		// En este punto: x = 1, y = 0;
		System.out.println("El resultado de la operacion con postasignación es: " + operacion2);
		
		int operacion3 = ++x + --y;
		// En este punto: x = 1, y = -1;
		System.out.println("El resultado de la operacion con preasignación es: " + operacion3);
		
		//Operador ternario
		// ? es un operador tipo pregunta para saber si la condición señalada es verdad (arroja un boolean). Es como un if abreviado
		int edad = 19; //valor1 = 0, valor2 = 1;
		
		// Tres formas de usar el ?
		//int resultado = (edad <= 18)? valor1 : valor2;
		//int resultado = (edad <= 18)? (valor1=1) : (valor2=2); //Si definimos aquí las variables es con paréntesis
		int resultado = (edad<=18) ? 2:1;

		System.out.println("El resultado de la condición ? es: " + resultado);
			
		//Operadores lógicos 
		// And - &&
		// or - ||
		// Not - !
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(true || false); //true
		System.out.println(true && !false); //true
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = sc.nextInt();
		System.out.println(num);
		
		
	}

}
