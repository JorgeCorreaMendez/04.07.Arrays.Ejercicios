import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[10];

        double media_Positivo = 0;
        int contador_Positivo = 0;

        double media_Negativo = 0;
        int contador_Negativo = 0;

        for (int i = 0; numeros.length > i; i++) {
            System.out.print("Introduzca el " + (i + 1) + "º número: ");
            numeros[i] = leer.nextInt();
        }

        leer.close();

        for (int i = 0; numeros.length > i; i++) {
            if (numeros[i] > 0) {
                media_Positivo += numeros[i];
                contador_Positivo++;

                if (numeros[i] < 0) {
                    media_Negativo += numeros[i];
                    contador_Negativo++;
                }
            }
        }

        media_Positivo = media_Positivo / contador_Positivo;
        media_Negativo = media_Negativo / contador_Negativo;

        if (contador_Positivo != 0) {
            System.out.println("La media de los números positivos es " + media_Positivo);
        } else {
            System.out.println("No has introducido ningún número positivo");
        }

        if (contador_Negativo != 0) {
            System.out.println("La media de los números negativos es " + media_Negativo);
        } else {
            System.out.println("No has introducido ningún número negativo");
        }

    }
}