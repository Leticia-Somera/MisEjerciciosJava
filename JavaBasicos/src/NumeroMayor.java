import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un primer n�mero:");
		Scanner sc1 = new Scanner(System.in);
		int numero1 = sc1.nextInt();
		
		System.out.println("Introduce un segundo n�mero:");
		Scanner sc2 = new Scanner(System.in);
		int numero2 = sc2.nextInt();
		
		System.out.println("Introduce un tercer n�mero:");
		Scanner sc3 = new Scanner(System.in);
		int numero3 = sc3.nextInt();
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("El n�mero m�s grande es:" + numero1);
			
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("El n�mero m�s grande es:" + numero2);	
			
		} else if ((numero3 > numero1) && (numero3 > numero2)) {
				System.out.println("El n�mero m�s grande es:" + numero3);
								
		} else {
				System.out.println("Los n�meros son iguales");
		}					
		
		
	}

}
