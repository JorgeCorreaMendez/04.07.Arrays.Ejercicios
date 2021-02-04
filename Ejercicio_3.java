import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 0;
        int alturaMedia = 0;

        int mediaSuperior = 0;
        int mediaInferior = 0;
        int mediaIgual = 0;

        do {
            System.out.print("Introduce un número de alturas para introducir: ");
            n = leer.nextInt();

            if (n <= 0) {
                System.out.println("Error, el número de alturas para introducir debe ser un número entero positivo");
            }
        } while (n <= 0);

        int[] alturas = new int[n];

        System.out.println("----------------------------");

        for (int i = 0; alturas.length > i; i++) {
            System.out.print("Introduzca la " + (i + 1) + "º altura (en cm): ");
            alturas[i] = leer.nextInt();

            alturaMedia = +alturas[i];
        }

        leer.close();

        alturaMedia = alturaMedia / n;

        System.out.println("----------------------------");

        System.out.println("La altura media es: " + alturaMedia + "cm");

        System.out.println("----------------------------");

        for (int i = 0; alturas.length > i; i++) {
            if (alturas[i] > alturaMedia) {
                mediaSuperior++;
            }

            if (alturas[i] < alturaMedia) {
                mediaInferior++;
            }

            if (alturas[i] == alturaMedia) {
                mediaIgual++;
            }
        }

        if (mediaSuperior != 0) {
            System.out.println("Hay " + mediaSuperior + " personas más altas que la media");
        } else {
            System.out.println("No hay ninguna persona por encima de la media");
        }

        if (mediaInferior != 0) {
            System.out.println("Hay " + mediaInferior + " personas más pequeñas que la media");
        } else {
            System.out.println("No hay ninguna persona por debajo de la media");
        }

        if (mediaIgual != 0) {
            System.out.println("Hay " + mediaIgual + " personas del mismo tamaño que la media");
        }
    }
}