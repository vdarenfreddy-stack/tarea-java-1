/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero:");
        numero = entrada.nextInt();
        for (int i = 1; i <= 12; i++){
            System.out.println(numero + "x" + i + "=" + (numero *i));
        }
        entrada.close();
    }
    
}
