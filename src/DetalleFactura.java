import java.util.Scanner;

public class DetalleFactura
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String strNombreFactura ="", strMensaje;
        double dPrecio1 =0, dPrecio2 =0, dImpuesto= 0, dTotalBruto = 0, dTotalNeto = 0;
        System.out.println("Ingrese el Nombre o Descripción de la factura: ");
        strNombreFactura = scanner.nextLine();
        try
        {
            System.out.println("Ingrese el precio del producto 1: ");
            dPrecio1 = scanner.nextDouble();
            System.out.println("Ingrese el precio del producto 2: ");
            dPrecio2 = scanner.nextDouble();

        }
        catch (Exception e)
        {
            System.out.println("No se ha ingresado un monto valido");
            main(args);
            System.exit(0);
        }
        dTotalBruto = dPrecio1 + dPrecio2;
        dImpuesto = dTotalBruto * 0.19;
        dTotalNeto = dTotalBruto + dImpuesto;

        strMensaje = "El monto de la fatura antes del impuesto es: "+ dTotalBruto;
        strMensaje += "\nEl impuesto calculado es: " + dImpuesto;
        strMensaje += "\nEl monto total despues del impuesto es: "+ dTotalNeto;
        System.out.println(strMensaje);
    }
}
