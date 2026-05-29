import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer los datos de la consola
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase o cadena de texto:");
        String cadenaOriginal = teclado.nextLine();

        /* * Usamos .replace(" ", "") para buscar cada espacio en blanco
         * y sustituirlo por un vacío (sin espacio), eliminándolos por completo.
         */
        String cadenaSinEspacios = cadenaOriginal.replace(" ", "");

        // Mostramos los resultados en la consola
        System.out.println("\n--- Resultado ---");
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        // Cerramos el scanner
        teclado.close();
    }
}