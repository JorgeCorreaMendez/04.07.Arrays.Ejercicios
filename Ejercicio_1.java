import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[10];
        int n_Positivo = 0;
        int n_Negativo = 0;
        int n_0 = 0;

        for (int i = 0; numeros.length > i; i++) {
            System.out.print("Introduzca el " + (i + 1) + "º número: ");
            numeros[i] = leer.nextInt();
        }

        leer.close();

        for (int i = 0; numeros.length > i; i++) {
            if (numeros[i] > 0) {
                n_Positivo++;
            }
        }

        for (int i = 0; numeros.length > i; i++) {
            if (numeros[i] < 0) {
                n_Negativo++;
            }
        }

        for (int i = 0; numeros.length > i; i++) {
            if (numeros[i] == 0) {
                n_0++;
            }
        }

        System.out.println("Hay " + n_0 + " Numeros iguales a 0");
        System.out.println("Hay " + n_Positivo + " Numeros positivos");
        System.out.println("Hay " + n_Negativo + " Numeros negativos");
    }
}
