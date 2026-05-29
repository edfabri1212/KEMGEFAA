import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingresa una frase o cadena de texto:");
        String cadenaOriginal = teclado.nextLine();

        // Convertimos la cadena en un arreglo de caracteres para poder modificarlos
        char[] caracteres = cadenaOriginal.toCharArray();

        /* * Esta variable sirve como "bandera".
         * Al inicio es true porque la primerísima letra de la cadena debe ir en mayúscula.
         */
        boolean siguienteEnMayuscula = true;

        // Recorremos el arreglo caracter por caracter
        for (int i = 0; i < caracteres.length; i++) {
            // Si encontramos un espacio en blanco, la próxima letra debe ser mayúscula
            if (caracteres[i] == ' ') {
                siguienteEnMayuscula = true;
            }
            // Si es un caracter cualquiera y la bandera está en true...
            else if (siguienteEnMayuscula) {
                // Convertimos ese caracter específico a mayúscula
                caracteres[i] = Character.toUpperCase(caracteres[i]);
                // Apagamos la bandera para que las siguientes letras sigan en minúscula
                siguienteEnMayuscula = false;
            }
        }

        // Convertimos el arreglo de caracteres de vuelta a un String
        String cadenaModificada = new String(caracteres);

        // Mostramos el resultado
        System.out.println("\n--- Resultado ---");
        System.out.println("Original:   " + cadenaOriginal);
        System.out.println("Modificada: " + cadenaModificada);

        teclado.close();
    }
}
