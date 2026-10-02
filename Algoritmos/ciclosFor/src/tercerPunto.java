import java.util.Scanner;

public class tercerPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = entrada.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma es: " + suma);

        entrada.close();
    }
}