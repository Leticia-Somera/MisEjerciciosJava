import java.util.Scanner;

public class EjercicioTriangulo {
public static void main(String[] args) {
		
		System.out.println("Cu�ntos lados tiene tu figura?");
		Scanner la = new Scanner(System.in);
		int lados = la.nextInt();
		
		System.out.println("Cu�l es el primer �ngulo interno de tu figura?");
		Scanner ang1 = new Scanner(System.in);
		int angulo1 = ang1.nextInt();
		
		System.out.println("Cu�l es el segundo �ngulo interno de tu figura?");
		Scanner ang2 = new Scanner(System.in);
		int angulo2 = ang2.nextInt();
			
		System.out.println("Cu�l es el tercer �ngulo interno de tu figura?");
		Scanner ang3 = new Scanner(System.in);
		int angulo3 = ang3.nextInt();
			
		double suma = (angulo1 + angulo2 + angulo3);
		
		if(lados == 3) {
			if(suma == 180) {
				System.out.println("Tu figura S� es un tri�ngulo");
			} else {
				System.out.println("Tu figura NO es un tri�ngulo");
			}
		} else {
			System.out.println("Tu figura NO es un tri�ngulo");
		}			
			
		}
		
}
