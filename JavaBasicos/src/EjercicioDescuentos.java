import java.util.Scanner;

public class EjercicioDescuentos {
public static void main(String[] args) {
		
		System.out.println("Cuánto es el monto de tu compra?");
		Scanner sc = new Scanner(System.in);
		double monto = sc.nextDouble();
		
		if(monto < 0) {
			System.out.println("Monto inválido");			
		} else if(monto < 1000) {
			System.out.println("No se aplica descuento");
			System.out.println("Monto a pagar: $" + monto);
		} else if(monto >= 1000 && monto <= 4999) {
			System.out.println("Se aplica 10% de descuento");
			System.out.println("Monto a pagar: $" + (monto*0.9));
		} else if(monto >= 5000 && monto <= 9999) {
			System.out.println("Se aplica 20% de descuento");
			System.out.println("Monto a pagar: $" + (monto*0.8));
		} else {
			System.out.println("Se aplica 30% de descuento");
			System.out.println("Monto a pagar: $" + (monto*0.7));
		}

}
}

