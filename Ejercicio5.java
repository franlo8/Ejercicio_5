
import java.util.Scanner;

class Ejercicio5 {
    public static void main(String[] args) {
        double y, x, suma;
        Scanner leerporteclado = new Scanner(System.in);
        suma = 0;
        System.out.println("Ingrese el valor de x " );
        x = leerporteclado.nextDouble();
        suma = suma + x;
        System.out.println("Ingrese el valor de y " );
        y = leerporteclado.nextDouble();
        x = x + Math.pow(y,2);
        suma = suma + (x/y);
        System.out.println("El valor de la suma es " + suma);
        
    }
}
