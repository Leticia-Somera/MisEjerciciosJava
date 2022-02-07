package metodos.java;

public class Metodos {
	//Un m�todo es una funci�n
	
	//atributos de la clase
	int a, b;
	
	//M�todo void (Vac�o)
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar" + a + " m�s " + b + "es: " + resultado); 
	}
	
	//metodo con retorno de valores
	public int sumaConRetorno() {
		/*
		int resultado = a + b;
		return resultado;
		Lo anterior se puede simplificar de la siguiente forma:
		*/
		return a + b;
	}
	
	//argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
	
	//M�todo est�tico
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
		
	}

}
