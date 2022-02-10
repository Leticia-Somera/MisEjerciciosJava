package com.gatitos;

public class Gato {
	
	//atributos
	
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//getters y setters
	//estos deben ser públicos para poder utilizarse fuera de la clase
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;
		} else {
			throw new IllegalArgumentException("El numero de patas no es válido");
		}
	}
	
	//en variables Boolean se cambia get por is
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	

}
