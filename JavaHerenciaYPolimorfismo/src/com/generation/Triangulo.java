package com.generation;

public class Triangulo extends FiguraGeometrica {
	
	//Declaro un constructor
	public Triangulo() {
		super("Triangulo");		
	}
	
	@Override
	public float calcularArea() {
		return (alto * largo) / 2;
	}

	@Override
	public float perimetro() {
		return 0;
	}
	
	

		
}
