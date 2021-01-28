import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        char[] alfabeto = new char[25];
        char caracter = 'A';

        int posicicionArray;
        String cadenaFinal = "";

        for (int i = 0; alfabeto.length > i; i++) {
            alfabeto[i] = caracter;
            caracter++;
        }

        do {
            System.out.print("Introduzca un posición de la array: ");
            posicicionArray = leer.nextInt();

            System.out.println("-----------------------------------");

            if (posicicionArray == -1) {
            } else if (posicicionArray < 0 || posicicionArray > 25) {
                System.out.println("Error, Introduzca otro número");
            } else {
                cadenaFinal += alfabeto[posicicionArray];
            }
        } while (posicicionArray != -1);

        leer.close();

        System.out.println("La cadena final es = " + cadenaFinal);
    }
}