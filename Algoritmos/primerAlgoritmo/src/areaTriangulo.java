import java.util.Scanner;

public class areaTriangulo {
    /*
    4.Cree un programa que tome la base y la altura de un triángulo e imprima su área.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura,area;
        System.out.println("Vamos a solicitar la base y la altura de un triangulo para calular su area");
        System.out.println("Ingrese el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();
        area = (base*altura)/2;
        System.out.println("La area de la triangulo es: " +area);
    }
}
