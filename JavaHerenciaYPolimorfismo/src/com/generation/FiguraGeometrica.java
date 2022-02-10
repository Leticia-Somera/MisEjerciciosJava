package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas
	//Son clases que pueden o no contener métodos abstractos
	//Estas clases no pueden contener objetos
	//Una clase abstracta puede tener o no un método abstracto
	//Un método abstracto debe estar contenido en una clase abstracta
	//Método abstracto te dice qué hacer pero no te dice cómo hacerlo
	
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
