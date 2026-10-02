import java.util.Scanner;

public class octavoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Nota 1: ");
            double n1 = entrada.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = entrada.nextDouble();

            System.out.print("Nota 3: ");
            double n3 = entrada.nextDouble();

            double promedio = (n1 + n2 + n3) / 3;

            System.out.println("Promedio: " + promedio);
        }

        entrada.close();
    }
}