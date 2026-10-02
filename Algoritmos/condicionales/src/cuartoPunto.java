import java.util.Scanner;

public class cuartoPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que lea un número y muestre si este es divisible entre cinco o no.

         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número NO es divisible entre 5.");
        }

        entrada.close();
    }
}