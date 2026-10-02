import java.util.Scanner;

public class primerPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que lea la edad de un usuario e imprima un mensaje que diga si el usuario es mayor de
edad o no.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}