/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
                int numero, suma = 0;
                double promedio;
                for (int i = 1; i <=10; i++){
                    System.out.println("Ingrese el numero" + i + ":");
                    numero = entrada.nextInt();
                    suma = suma + numero;
                }
                promedio = suma / 10.0;
                System.out.println("Suma total" + suma);
                System.out.println("Promedio" + promedio);
                entrada.close();
    }
    
}
