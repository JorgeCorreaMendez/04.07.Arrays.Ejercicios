import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase = leer.nextLine();

        do {
            System.out.print("Introduzca una frase: ");
            frase = leer.nextLine();

            if (frase.equals("")) {
                System.out.println("No has introducido ninguna cadena, vuelva a intentarlo");
            }
        } while (frase.equals(""));

        char caracter[] = new char[frase.length()];

        for (int i = 0; frase.length() > i; i++) {
            caracter[i] = frase.charAt(i);
            System.out.println(caracter[i]);
        }

        leer.close();
    }
}
