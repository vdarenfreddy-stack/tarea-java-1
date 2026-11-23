/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numero, cantidad = 0, suma = 0;
        System.out.println("Ingrese un numero(negrativo para terminar):");
        numero = entrada.nextInt();
        while (numero >= 0){
            cantidad++; 
            suma = suma + numero;
            System.out.println("Ingrese otro numero:");
            numero = entrada.nextInt();
        }
        System.out.println("Cantidad de numeros:" + cantidad);
        System.out.println("Sum total:" + suma);
        entrada.close();
    }
    
}
