import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la array: ");
        int n = leer.nextInt();
        int ultimoDijito;

        double[] nAleatorios = new double[n];

        for (int i = 0; nAleatorios.length > i; i++) {
            int numeroAleatorio = (int) (Math.random() * 300 + 1);
            nAleatorios[i] = numeroAleatorio;
        }

        do {
            System.out.print("Introduce un número: ");
            ultimoDijito = leer.nextInt();

            if(ultimoDijito < 0 || ultimoDijito > 10){
                System.out.println("El número tiene que estar entre 0 y 10");
            }
        } while (ultimoDijito < 0 || ultimoDijito > 10);

        leer.close();

        System.out.println("------------------------------------------");

        for (int i = 0; nAleatorios.length > i; i++) {
            if (Double.toString(nAleatorios[i]).length() == 5) {

                double calculo = nAleatorios[i] / 10;
                double calculoTruncado = Math.floor(calculo);

                calculo = (calculo - calculoTruncado) * 10;

                if (ultimoDijito != calculo)
                    continue;
                System.out.println("El número " + nAleatorios[i] + " acaba en " + ultimoDijito);
                System.out.println("------------------------------------------");
            }

            if (Double.toString(nAleatorios[i]).length() == 4) {

                double calculo = nAleatorios[i] / 10;
                double calculoTruncado = Math.floor(calculo);

                calculo = (calculo - calculoTruncado) * 10;

                if (ultimoDijito != calculo)
                    continue;
                System.out.println("El número " + nAleatorios[i] + " acaba en " + ultimoDijito);
                System.out.println("------------------------------------------");
            }

            if (nAleatorios[i] == ultimoDijito) {
                System.out.println("El número " + nAleatorios[i] + " acaba en " + ultimoDijito);
                System.out.println("------------------------------------------");
            }

        }
    }
}