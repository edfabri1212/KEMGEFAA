import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir frase
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        // Buscar el último espacio
        int posicion = frase.lastIndexOf(" ");

        // Eliminar última palabra
        String nuevaFrase = frase.substring(0, posicion);

        // Mostrar resultado
        System.out.println("Frase sin la última palabra:");
        System.out.println(nuevaFrase);
    }
}