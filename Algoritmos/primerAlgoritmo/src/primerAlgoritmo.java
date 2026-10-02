import java.util.Scanner;

public class primerAlgoritmo {

    public static void main(String[] args) {
        /*
        Cree un programa que lea la edad de un usuario y muestre cuántos años tendrá el usuario dentro
        de tantos años como éste indique. Por ejemplo, si el usuario tiene 20 años
        y quiere saber cuántos años tendrá
        dentro de 15 años, el programa deberá mostrar que tendrá 35 años.
            */
        Scanner leer = new Scanner(System.in);
        int edad,anosSumar,edadFutura;
        System.out.println("Ingrese su edad por favor: ");
        edad = leer.nextInt();
        System.out.println("Ingrese la cantidad de años que quiere sumar a su edad");
        anosSumar = leer.nextInt();
        edadFutura = edad+anosSumar;
        System.out.println("Su edad dentro de "+anosSumar+" años será :"+edadFutura);


    }
}