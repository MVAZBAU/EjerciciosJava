/**
** Nombre:				OrdenaNumeros
** Propósito:           Ordenar dos números
** Descripción:         Pedir dos números por consola y mostrarlos ordenados de mayor a menor.
** Retorna:
**
** Fecha creación:      30/01/2022
** Autor o creador:		MVAZBAU
**
** Fecha modificación:
** Autor modificación:
** Revisión:
**/
import java.util.Scanner;

public class OrdenaNumeros
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero1 = s.nextInt();
        System.out.println("Ingrese un segundo número: ");
        int numero2 = s.nextInt();
        String resultado =  (numero1 > numero2) ?
                            "Numero mayor: " + numero1 + "\nNumero menor: " + numero2:
                            "Numero mayor: " + numero2 + "\nNumero menor: " + numero1;
        System.out.println(resultado);
    }
}
