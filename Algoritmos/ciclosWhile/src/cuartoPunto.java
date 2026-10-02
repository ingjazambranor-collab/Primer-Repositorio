import java.util.Scanner;

public class cuartoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = entrada.nextInt();

        int i = 1;

        while (i <= n) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++;
        }

        entrada.close();
    }
}