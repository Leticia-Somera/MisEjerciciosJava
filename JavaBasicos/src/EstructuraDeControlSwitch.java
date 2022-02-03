import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	//Las estructuras de control nos sirven para controlar el flujo de comportamientos de un programa. Para la toma de decisiones 
	
	/* switch(condición a evaluar) {
		case "valor":
			código a ejecutar
			break;
		case "n":
			código a ejecutar
			break;
		default:
			código a ejecutar
			break;		
	}
	*/
	
	//Solicitar al usuario un día de la semana y mostrar un mensaje
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un día de la semana y recibe un bonito mensaje");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Ya mero es viernes.");
				break;
			case "martes":
				System.out.println("Lunes chiquito. Esto está cansado, pero ya casi.");
				break;
			case "miercoles":
				System.out.println("Miércoles, pero a qué costo."); 
				break;
			case "jueves":
				System.out.println("Juebebes de sed peiligrosa.");
				break;
			case "viernes":
				System.out.println("Viernes de fiesta hasta morir.");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Basta de trabajación");
				break;
			default:
				System.out.println("Día desconocido, Kha");
		}		
		
	}

}
