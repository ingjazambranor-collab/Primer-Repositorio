import java.util.Scanner;

public class qunitoPunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcion = "";

        while (!opcion.equalsIgnoreCase("S")) {

            System.out.print("¿Desea salir? (S/N): ");
            opcion = entrada.nextLine();
        }

        System.out.println("Programa finalizado.");

        entrada.close();
    }
}