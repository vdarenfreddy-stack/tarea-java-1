/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
               Scanner entrada;
        entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }
        entrada.close();
    }
    
}
