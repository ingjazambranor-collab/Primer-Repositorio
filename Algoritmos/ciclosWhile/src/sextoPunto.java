import java.util.Scanner;

public class sextoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        double suma = 0;

        while (contador <= 10) {

            System.out.print("Ingrese número " + contador + ": ");
            suma += entrada.nextDouble();

            contador++;
        }

        double promedio = suma / 10;

        System.out.println("Promedio = " + promedio);

        entrada.close();
    }
}