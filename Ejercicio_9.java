import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] nombre = new String[10];
        int[] sexo = new int[10];
        int[] trabajo = new int[10];
        int[] sueldo = new int[10];

        for (int i = 0; nombre.length > i; i++) {
            System.out.print("Introduzca el nombre de la " + (i + 1) + "º persona: ");
            nombre[i] = leer.next();

            do {
                System.out.print("Introduzcaº el sexo de la " + (i + 1) + "º persona( 1 = masculino, 2 = femenino): ");
                sexo[i] = leer.nextInt();
                if (sexo[i] != 1 && sexo[i] != 2) {
                    System.out.println("Error, introduce un 1 o un 2");
                }
            } while (sexo[i] != 1 && sexo[i] != 2);

            do {
                System.out.print(
                        "Introduzca el trabajo de la " + (i + 1) + "º persona( 1 = si trabajo, 2 = no trabajo): ");
                trabajo[i] = leer.nextInt();
                if (trabajo[i] == 1) {
                    do {
                        System.out.print("Introduzca un sueldo de la " + (i + 1) + "º persona(entre 600 y 2000): ");
                        sueldo[i] = leer.nextInt();
                        if (sueldo[i] < 600 || sueldo[i] > 2000) {
                            System.out.println("Error, introduce un sueldo entre 600 y 2000");
                        }
                    } while (sueldo[i] < 600 || sueldo[i] > 2000);
                }
                if (trabajo[i] != 1 && trabajo[i] != 2) {
                    System.out.println("Error, introduce un 1 o un 2");
                }
            } while (trabajo[i] != 1 && trabajo[i] != 2);
            System.out.println("---------------------------------------");
        }
        leer.close();

        int cantHombres = 0;
        int cantMujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldo_medioHombres = 0;
        int sueldo_medioMujeres = 0;

        for(int i = 0;sexo.length > i;i++){
            if(sexo[i] == 1){
                cantHombres++;
            }

            if(sexo[i] == 2){
                cantMujeres++;
            }

            if(sexo[i] == 1 && trabajo[i] == 1){
                hombresTrabajan++;
            }

            if(sexo[i] == 2 && trabajo[i] == 1){
                mujeresTrabajan++;
            }

            if(sexo[i] == 1 && trabajo[i] == 1){
                sueldo_medioHombres =+ sueldo[i];
            }

            if(sexo[i] == 1 && trabajo[i] == 1){
                sueldo_medioMujeres =+ sueldo[i];
            }
        }

        System.out.println("El porcentaje de hombre " + (cantHombres * 10) + "%");
        System.out.println("El porcentaje de mujer " + (cantMujeres * 10) + "%");

        System.out.println("---------------------------------------");

        System.out.println("El porcentaje de hombre que trabajan " + (hombresTrabajan * 10) + "%");
        System.out.println("El porcentaje de mujer que trabajan " + (mujeresTrabajan * 10) + "%");

        System.out.println("---------------------------------------");

        System.out.println("El sueldo promedio de las hombres es: " + (sueldo_medioHombres / hombresTrabajan) + "€");
        System.out.println("El sueldo promedio de las mujeres es:  " + (sueldo_medioMujeres / mujeresTrabajan) + "€");
    }
}