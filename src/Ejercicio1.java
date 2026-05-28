import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Corrección aquí: Usamos System.in
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase:");
        String frase = teclado.nextLine();

        if (frase.trim().isEmpty()) {
            System.out.println("La frase contiene 0 palabras.");
        } else {
            String[] palabras = frase.trim().split("\\s+");
            int cantidadPalabras = palabras.length;
            System.out.println("La frase contiene " + cantidadPalabras + " palabra(s).");
        }

        teclado.close();
    }
}
