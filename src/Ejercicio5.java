import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir frase
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        int contador = 0;

        // Recorrer texto letra por letra
        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            // Verificar si es A o a
            if (letra == 'A' || letra == 'a') {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("La vocal A aparece " + contador + " veces.");
    }
}