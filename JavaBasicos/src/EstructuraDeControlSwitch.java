import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	//Las estructuras de control nos sirven para controlar el flujo de comportamientos de un programa. Para la toma de decisiones 
	
	/* switch(condici�n a evaluar) {
		case "valor":
			c�digo a ejecutar
			break;
		case "n":
			c�digo a ejecutar
			break;
		default:
			c�digo a ejecutar
			break;		
	}
	*/
	
	//Solicitar al usuario un d�a de la semana y mostrar un mensaje
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un d�a de la semana y recibe un bonito mensaje");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Ya mero es viernes.");
				break;
			case "martes":
				System.out.println("Lunes chiquito. Esto est� cansado, pero ya casi.");
				break;
			case "miercoles":
				System.out.println("Mi�rcoles, pero a qu� costo."); 
				break;
			case "jueves":
				System.out.println("Juebebes de sed peiligrosa.");
				break;
			case "viernes":
				System.out.println("Viernes de fiesta hasta morir.");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Basta de trabajaci�n");
				break;
			default:
				System.out.println("D�a desconocido, Kha");
		}		
		
	}

}
