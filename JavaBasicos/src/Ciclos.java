
public class Ciclos {
	public static void main(String[] args) {
		
		/*while		
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;			
		}
		*/
		
		/*do while
		//Se ejecuta una vez antes de evaluar la condición
		int control = 3;
		
		do {
			//código a ejecutar
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;			
		} while(control < 3);
		*/
		
		/*for */
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				//System.out.println("Control = " + i);
				//break; //break termina el ciclo y solo deja que se ejecute una vez
				continue; //continue nos permite saltar una iteración del for
				//lo que está antes de continue SÍ se ejecuta pero NO se ejecuta lo que está después
			}		
			System.out.println("Control = " + i);			
		}		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Control_2 = " + i);
			continue;
		}
	}
}
