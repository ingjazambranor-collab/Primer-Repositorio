import java.util.Scanner;

public class septimoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero;
        double suma = 0;
        int contador = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = entrada.nextDouble();

        while (numero != 0) {

            suma += numero;
            contador++;

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = entrada.nextDouble();
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Promedio = " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }

        entrada.close();
    }
}