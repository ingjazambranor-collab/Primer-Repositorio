import java.util.Scanner;

public class tercerPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que lea un número y muestre si este es par o impar.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        entrada.close();
    }
}