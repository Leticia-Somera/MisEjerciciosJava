package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas
	//Son clases que pueden o no contener m�todos abstractos
	//Estas clases no pueden contener objetos
	//Una clase abstracta puede tener o no un m�todo abstracto
	//Un m�todo abstracto debe estar contenido en una clase abstracta
	//M�todo abstracto te dice qu� hacer pero no te dice c�mo hacerlo
	
	private String nombre;
	protected float alto;
	protected float largo;
	
	public FiguraGeometrica(String nombre) {
		//this.nombre = nombre;		
	}
	
	public String getNombre() {
		//return alto * largo;
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}
	
	public float getAlto() {
		//return alto * largo;
		return this.alto;
	}
	
	public void setAlto(float alto) {
		this.alto = alto;		
	}
	
	public float getLargo() {
		//return alto * largo;
		return this.largo;
	}
	
	public void setLargo(float largo) {
		this.largo = largo;		
	}
	
	public abstract float perimetro();
	
	public abstract float calcularArea();
	/*
	public float calcularArea() {
		return alto * largo;
	}
	*/
	
	
}
