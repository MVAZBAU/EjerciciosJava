import java.util.Scanner;

/**
 ** Nombre:             MultiplicaSinOperador
 ** Propósito:          Multiplicar dos números sin el operador correspondiente a la operación
 ** Descripción:        Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin
 *                      usar el símbolo de multiplicación (*).
 *                      Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
 *                      donde menos por menos es positivo.
 *
 ** Retorna:
 **
 ** Fecha creación:     28/02/2022
 ** Autor o creador:	MVAZBAU
 **
 ** Fecha modificación:
 ** Autor modificación:
 ** Revisión: 0
**/

public class MultiplicaSinOperador
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        int iNumero1 = 0, iNumero2 = 0, iResultado = 0;
        System.out.println("Ingresa un primer número (negativo o positivo): ");
        iNumero1 = sn.nextInt();
        System.out.println("Ingresa un segundo número (negativo o positivo): ");
        iNumero2 = sn.nextInt();

        if((iNumero1 > 0) && (iNumero2 > 0) )
            for (int i = 0; i < iNumero1; i++ )
                iResultado += iNumero2;
        else
            if((iNumero1 < 0) && (iNumero2 < 0) )
                for (int i = iNumero1; i < 0; i++ )
                    iResultado += Math.abs(iNumero2);
            else
            {
                if (iNumero2 < 0)
                    for (int i = 0; i < iNumero1; i++ )
                        iResultado += iNumero2;
                if (iNumero1 < 0)
                    for (int i = 0; i < iNumero2; i++ )
                        iResultado += iNumero1;
            }
        System.out.println("El resultado de la multiplicacion es: " + iResultado);
    }
}
