package paquete2;

public class ClasePrivada {
	//atributos
	private String nombre;
	private int edad;
	
	//m�todos
	//los m�todos set van a fijar o modificar un valor
	public void setSaludar(String nombre) {
		this.nombre = nombre;		
	}
	
	public String getSaludar() {
		return this.nombre;
		
	}

}
