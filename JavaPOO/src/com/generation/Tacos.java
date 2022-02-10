package com.generation;

public class Tacos {
	
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;
	
	
	//getters y setters
	public String getTipoDeTortilla() {
		return this.tipoDeTortilla;
	}
	
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;		
	}
	
	public String getTipoDeGuisado() {
		return this.tipoDeGuisado;
	}
	
	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;		
	}
	
	public int getNumeroDeTortilla() {
		return this.numeroDeTortilla;
	}
	
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;		
	}
	
	public String getTamanioDeTortilla() {
		return this.tamanioDeTortilla;
	}
	
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;		
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;		
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
	
	/*
	//El constructor nos ayuda a inicializar objetos. 
	//Dependiendo de las variables que introduzcamos en Main, JAVA reconocerá a cuál constructor estoy llamando
	//Un constructor vacío da la oportunidad de crear el objeto detalladamente
	public Tacos() {
		
	}
	
	//También puedo definir otro constructor con una sola variable.
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
		
	}
	
	public Tacos(String tipoDeTortilla, 
			String tipoDeGuisado, 
			int numeroDeTortilla, 
			String tamanioDeTortilla, 
			float precio) {
		this.tipoDeTortilla = tipoDeTortilla; //el this hace referencia a la variable de la línea 5 que definimos al inicio
		this.tipoDeGuisado = tipoDeGuisado; 
		this.numeroDeTortilla = numeroDeTortilla; 
		this.tamanioDeTortilla = tamanioDeTortilla; 
		this.precio = precio; 
	}
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}

	*/

	
	
}
