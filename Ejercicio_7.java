import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] DNI = new int[8];
        int restoDNI = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        for (int i = 0; DNI.length > i; i++) {
            do {
                System.out.print("Introduce la " + (i + 1) + "º letra de tu DNI: ");
                DNI[i] = leer.nextInt();
                if (DNI[i] < 0 || DNI[i] > 9) {
                    System.out.println("Error, debes introducir un número entre 0 y 9");
                }
            } while (DNI[i] < 0 || DNI[i] > 9);

            restoDNI = restoDNI + DNI[i];
        }

        leer.close();

        System.out.println("-----------------------------------");

        int resto = restoDNI % 22;
        char letra = letras.charAt(resto);

        if (resto >= 0 && resto <= 22) {
            System.out.print("Tu DNI es: ");

            for (int i = 0; DNI.length > i; i++) {
                System.out.print(DNI[i]);
            }

            System.out.println(letra);
        } else {
            System.out.println("Error, tu DNI no es correcto");
        }
    }
}
