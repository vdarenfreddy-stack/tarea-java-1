/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercico8 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        String clave;
        do{
            System.out.println("Ingrese la contraseña:");
            clave = entrada.nextLine();
        } while (!clave.equals("java2026"));
        System.out.println("Acceso concedido.");
        entrada.close();
    }
    
}
