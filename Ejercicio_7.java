import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] DNI = new int[8];
        int restoDNI = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        for(int i = 0;DNI.length > i;i++){
            System.out.print("Introduce la " + (i + 1) + "º letra de tu DNI: ");
            DNI[i] = leer.nextInt(); 
            restoDNI = restoDNI + DNI[i];
        }
        
        leer.close();

        char letra = letras.charAt(restoDNI % 23);

        for(int i = 0;letras.length() > i;i++){
            if(letra == i){
                System.out.println(letras.charAt(letra));
                break;
            }
        }


    }
}
