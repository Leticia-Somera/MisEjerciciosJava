import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un primer número:");
		Scanner sc1 = new Scanner(System.in);
		int numero1 = sc1.nextInt();
		
		System.out.println("Introduce un segundo número:");
		Scanner sc2 = new Scanner(System.in);
		int numero2 = sc2.nextInt();
		
		System.out.println("Introduce un tercer número:");
		Scanner sc3 = new Scanner(System.in);
		int numero3 = sc3.nextInt();
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("El número más grande es:" + numero1);
			
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("El número más grande es:" + numero2);	
			
		} else if ((numero3 > numero1) && (numero3 > numero2)) {
				System.out.println("El número más grande es:" + numero3);
								
		} else {
				System.out.println("Los números son iguales");
		}					
		
		
	}

}
