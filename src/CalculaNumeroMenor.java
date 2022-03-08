//import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

/**
 ** Nombre:             CalculaNumeroMenor
 ** Propósito:          Buscar el número menor
 ** Descripción:        Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
 *                      usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
 *                      el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
 *                         1. Calcular el menor número e imprimir el valor.
 *                      Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
 *                      si no, imprimir " el numero menor es igual o mayor que 10!".
 ** Retorna:
 **
 ** Fecha creación:     20/02/2022
 ** Autor o creador:	MVAZBAU
 **
 ** Fecha modificación: 24/02/2022
 ** Autor modificación: MVAZBAU
 ** Revisión: 1
 **/
public class CalculaNumeroMenor
{
    public static void main(String[] args)
    {
        int iTotalNumeros = 0, iNumeroMenor = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa el total de numeros a recibir: ");
        iTotalNumeros = sn.nextInt();
        if (iTotalNumeros < 10)
        {
            System.out.println("El total de números a validar debe ser mayor que 10!");
        }
        else
        {
            int iNumeros[] = new int[iTotalNumeros];
            for (int i = 0; i < iTotalNumeros; i++)
            {
                System.out.println("Ingrese un numero entero: ");
                iNumeros[i] = sn.nextInt();
            }
            iNumeroMenor = iNumeros[0];

            for (int i = 1; i < iTotalNumeros; i++)
            {
                if(iNumeros[i] < iNumeroMenor)
                    iNumeroMenor = iNumeros[i];
            }

            System.out.println("El número menor es: " + iNumeroMenor);
            String mensaje = iNumeroMenor < 10 ? "El número menor es menor que 10!":
                        "El número menor es igual o mayor que 10!";
            System.out.println(mensaje);
        }
    }
}
