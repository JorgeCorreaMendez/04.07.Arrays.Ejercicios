import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[][] paisCiudades = new String[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduzca el nombre del " + (i + 1) + "º país: ");
            paisCiudades[i][0] = leer.nextLine();
            System.out.println("-----------------------------");
            for (int j = 1; j <= 3; j++) {
                System.out.printf("Introduzca el nombre del " + j + "º ciudad: ");
                paisCiudades[i][j] = leer.nextLine();
            }
            System.out.println("-----------------------------");
        }

        leer.close();

        for (int i = 0; i < 4; i++) {
            System.out.print("País: " + paisCiudades[i][0] + " Ciudad: ");
            for (int j = 1; j <= 3; j++) {
                System.out.printf(paisCiudades[i][j] + " ");
            }
            System.out.println("");
        }
    }
}