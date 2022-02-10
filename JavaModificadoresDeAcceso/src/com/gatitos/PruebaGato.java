package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato();
		
		//g.nombre = "Taco";
		//g.patas = 3;
		
		g.setNombre("Taco");
		g.setPatas(4);
		g.setAdoptado(false);
		
		System.out.println(g);
		System.out.println("Mi gato se llama " + g.getNombre());

		
		//exepciones (errores)
		//error de tiempo de ejecución
		/*
		int num1 = 5, num2 = 0;
		int resultado = num1/num2;
		System.out.println(resultado);
		*/
	}

}
