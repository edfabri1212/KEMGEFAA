import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();

        // Invertir palabra
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        // Comparar
        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra NO es palíndroma.");
        }
    }
}