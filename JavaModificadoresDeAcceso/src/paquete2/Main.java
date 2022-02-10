package paquete2;
import paquete1.ClaseDefault; 
import paquete1.ClaseProtected;

public class Main extends paquete1.ClaseProtected {
	public static void main(String[] args) {
		//ClaseDefault prueba = new ClaseDefault();
		
		//prueba.mostrar();
		
		//ClasePrivada privada = new ClasePrivada();
		
		//privada.edad = 30;
		//privada.nombre = "Leticia";
		//privada.setSaludar("Leticia");
		
		//System.out.println(privada.getSaludar());
		//System.out.println(privada.nombre); //Esto no se imprimirá porque tiene acceso limitado
		
		//Objeto de la clase protected
		Main protegido = new Main(); //objeto creado
		
		protegido.setEdad(18);
		
		System.out.println(protegido.getEdad());
		
	}

}
