import java.util.Scanner;

public class qunitoPunto {
    public static void main(String[] args) {
        /*
        Cree un programa que lea un número entre 1 y 15 y muestre si éste es primo o no.
         */
        Scanner entrada = new Scanner(System.in);
        int numero=0,contador=0;

        while (numero <=0 || numero >15){
            System.out.print("Ingrese un número entre 1 y 15: ");
            numero = entrada.nextInt();
        }
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0){
                contador++;
            }
        }
        if (contador>2) {
            System.out.println("El número no es primo.");
        } else {
            System.out.println("El número es primo.");
        }

    }
}