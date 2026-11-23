/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
               Scanner entrada;
        entrada = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese la nota");
        nota = entrada.nextDouble();
        if (nota >=7){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        entrada.close();
    }
}
