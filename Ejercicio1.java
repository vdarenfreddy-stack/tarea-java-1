/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        String nombre, carrera;
        int edad; 
        double estatura;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su carrera");
        carrera = entrada.nextLine();
        System.out.println("Ingrese su estatura");
        estatura = entrada.nextDouble();
        System.out.println("\n---DATOS PERSONALES ---");
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Carrera:" + carrera);
        System.out.println("Estatura:" + estatura);
      entrada.close();
    }
    
}           
