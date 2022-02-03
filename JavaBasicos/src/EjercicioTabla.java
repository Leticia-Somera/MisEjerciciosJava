/*
1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione
3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
*/
import java.util.Scanner;

public class EjercicioTabla {
	public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
        int num;
        int i = 0;
        
        System.out.print("Ingresa cualquier n�mero positivo: ");
        num = console.nextInt();
                
        System.out.println("Tabla de multiplicar del n�mero  " + num);        
        console.close();
        
        while(i < 10) {
        	i++;
        	int multi = num * i;
        	System.out.println(num + " x " + i + " = " + multi);        	
        }        
    }
}
