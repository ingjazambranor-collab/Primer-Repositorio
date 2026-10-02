import java.util.Scanner;

public class decimoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            suma += entrada.nextDouble();
        }

        double promedio = suma / 10;

        System.out.println("El promedio es: " + promedio);

        entrada.close();
    }
}