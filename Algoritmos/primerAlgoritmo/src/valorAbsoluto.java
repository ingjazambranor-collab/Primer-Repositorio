import java.util.Scanner;

public class valorAbsoluto {
    public static void main(String[] args) {
        /*
        6.Cree un programa que tome un número real e imprima su valor absoluto.
         */
        Scanner entrada = new Scanner(System.in);
        double numero;
        System.out.print("Ingrese un número real: ");
        numero = entrada.nextDouble();
        double valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto es: " + valorAbsoluto);
    }
}