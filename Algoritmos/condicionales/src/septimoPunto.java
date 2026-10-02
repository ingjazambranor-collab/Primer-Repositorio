import java.util.Scanner;

public class septimoPunto {
    public static void main(String[] args) {
        /*
        En un supermercado se tiene los siguientes productos: lentejas, crema, arroz y vino. Las lentejas y el arroz no
pagan IVA, el vino y la crema si. Cree un programa que reciba el nombre de alguno de los productos
mencionados y muestre si el producto paga IVA o no.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = entrada.nextLine().toLowerCase();

        if (producto.equals("vino") || producto.equals("crema")) {
            System.out.println("El producto paga IVA.");
        } else if (producto.equals("lentejas") || producto.equals("arroz")) {
            System.out.println("El producto NO paga IVA.");
        } else {
            System.out.println("Producto no válido.");
        }

        entrada.close();
    }
}