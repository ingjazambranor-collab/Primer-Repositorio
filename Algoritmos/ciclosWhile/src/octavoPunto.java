import java.util.Scanner;

public class octavoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = entrada.nextInt();

        int i = 1;
        int suma = 0;

        while (i <= n) {

            suma += i * i;

            i++;
        }

        System.out.println("La suma de los cuadrados es: " + suma);

        entrada.close();
    }
}