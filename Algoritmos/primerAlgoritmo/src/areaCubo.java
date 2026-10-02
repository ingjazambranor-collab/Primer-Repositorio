import java.util.Scanner;

public class areaCubo {
    static void main() {
        /*
        5.Cree un programa que tome el lado de un cubo e imprima su volumen.
         */
        Scanner sc = new Scanner(System.in);
        double lado,area;
        System.out.println("Vamos a solicitar el valor del lado de un cubo para calular su area");
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
        area = 6*(Math.pow(lado,2));
        System.out.println("El area del cubo es: "+area);
    }
}
