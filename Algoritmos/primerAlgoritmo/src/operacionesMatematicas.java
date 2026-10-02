import java.util.Scanner;

public class operacionesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int suma, resta;
        double multiplicacion, division;
        System.out.println("Se solicitarán dos numero para realizar las operaciones  matematicas basicas");
        System.out.println("Ingrese por favor el primer numero para operar: ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero para operar: ");
        b = sc.nextInt();
        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        division = a/b;
        System.out.println("El resultado de las operaciones entre "+a+" y "+b+" son: \n"+" - Suma : "+suma+"\n - Resta: "+resta + "\n - Multiplicacion: "+multiplicacion+"\n - Division: "+division);
    }
}
