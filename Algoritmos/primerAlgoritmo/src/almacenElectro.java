import java.util.Scanner;

public class almacenElectro {

    public static void main(String[] args) {
        /*
        En un almacén de electrodomésticos se venden éstos a crédito y de contado.
        Si el cliente compra a crédito, el valor global del electrodoméstico aumenta
        en un 25%. Cree un programa que lea del usuario el precio de un electrodoméstico
        y el plazo en meses para pagarlo a crédito y muestre al usuario el valor fijo de las cuotas
        mensuales que deberá pagar por el electrodoméstico.
         */
                Scanner entrada = new Scanner(System.in);

                double precio, precioCredito, cuotaMensual;
                int meses;

                System.out.print("Ingrese el precio del electrodoméstico: ");
                precio = entrada.nextDouble();

                System.out.print("Ingrese el plazo en meses: ");
                meses = entrada.nextInt();

                precioCredito = precio * 1.25;

                cuotaMensual = precioCredito / meses;

                System.out.println("\nValor total a crédito: $" + precioCredito);
                System.out.println("Cuota mensual fija: $" + cuotaMensual);
            }
        }
