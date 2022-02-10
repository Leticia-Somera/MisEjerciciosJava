package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	//Declaro un constructor
	public Cuadrado() {
		super("Cuadrado");		
	}

	@Override
	public float perimetro() {
		return (getAlto() + getLargo()) * 2;
	}

	@Override
	public float calcularArea() {
		return getAlto() * getLargo();

	}

}
