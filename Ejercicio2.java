/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Suma:" + (num1 + num2));
        System.out.println("Resta:" + (num1 - num2));
        System.out.println("Multiplicacion:" + (num1 * num2));
        if (num2 != 0){
        System.out.println("Division:" + ((double) num1 / num2));
        System.out.println("Residuo:" + (num1 % num2));
        } else { 
            System.out.println("No se puede dividir para cero");
        }
        entrada.close();
    }
    
}
