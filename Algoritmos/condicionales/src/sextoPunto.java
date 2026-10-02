import java.util.Scanner;

public class sextoPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que reciba dos números y muestre el mayor. En caso de que los números sean iguales
también se debe mostrar al usuario.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }

        entrada.close();
    }
}