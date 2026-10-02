import java.util.Scanner;

public class segundoPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que lea los tres ángulos internos de un triángulo y muestre si los ángulos corresponden a un
triángulo o no.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el segundo ángulo: ");
        int b = entrada.nextInt();

        System.out.print("Ingrese el tercer ángulo: ");
        int c = entrada.nextInt();

        if (a + b + c == 180) {
            System.out.println("Los ángulos forman un triángulo.");
        } else {
            System.out.println("Los ángulos NO forman un triángulo.");
        }

        entrada.close();
    }
}