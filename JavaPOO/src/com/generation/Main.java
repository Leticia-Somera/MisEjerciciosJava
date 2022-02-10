package com.generation;

public class Main {

	public static void main(String[] args) {
		Tacos t = new Tacos();
		
		t.setTipoDeTortilla("Harina");
		t.setTipoDeGuisado("Pastor");
		t.setNumeroDeTortilla(2); 
		t.setTamanioDeTortilla("Grande");
		t.setPrecio(13.5f); 
		
		System.out.println(t);
		System.out.println("Pedí un taco " + t.getTamanioDeTortilla() + " de " + t.getTipoDeGuisado());
			
			
		/*
		Tacos taco1 = new Tacos("Masa Azul", "Suadero", 2, "Mediana", 30);		
		//taco1.tipoDeTortilla = "Masa Azul";
		//taco1.tipoDeGuisado = "Suadero";
		//taco1.numeroDeTortilla = 2;
		//taco1.tamanioDeTortilla = "Mediana";
		//taco1.precio = 30;
		taco1.subirPrecio(5.5f);
		
		//System.out.println(taco1.toString());
		
		
		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 42.6f;
		taco2.tipoDeTortilla = "Trigo"; //este valor reempazará el primer tipo de tortilla (reasignaciòn)
		
		
		Tacos taco3 = new Tacos("Maíz");
		
		System.out.println(taco1); //se llama al método toString por default
		System.out.println(taco2);
		System.out.println(taco3); //cuando no se recibe el resto de argumentos o parámetros, imprime los valores default null y 0
		*/
		
	}

}
