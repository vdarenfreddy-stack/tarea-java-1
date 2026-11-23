/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner (System.in);
        int dia;
        System.out.println("Ingrese un numero del 1 al 7:");
        dia = entrada.nextInt();
        switch(dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero no valido");
        }
        entrada.close();
    }
    
}
