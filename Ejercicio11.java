/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numero, mayor, menor;
        System.out.println("Ingrese el numero 1:");
        numero = entrada.nextInt();
        mayor = numero;
        menor = numero;
        for (int i = 2; i <= 10; i++){
            System.out.println("Ingrese el numero" + i + ":");
            if (numero > mayor){
                mayor = numero;            
            }
            if (numero < menor){
                menor = numero;
            }
        }
        System.out.println("Numero mayoe:");
        System.out.println("Numero menor:");
        entrada.close();
    }
    
}
