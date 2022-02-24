import java.util.Scanner;

/**
 ** Nombre:             SistemaTareas
 ** Propósito:          Sistema de almacenamiento de tareas
 ** Descripción:        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
 *                      Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
 *                      ademas mostrar el promedio total.
 *
 *                      Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
 *                      para realizar los cálculos (contadores, sumas).
 *
 *                      * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje
 *                      de error finalizando el programa.

 ** Retorna:
 **
 ** Fecha creación:     20/02/2022
 ** Autor o creador:	MVAZBAU
 **
 ** Fecha modificación: 24/02/2022
 ** Autor modificación: MVAZBAU
 ** Revisión: 1
 **/
public class SistemaTareas
{
    public static void main(String[] args)
    {
        double dNota = 0, dPromedioMayores = 0, dPromomedioMenores = 0, dPromedioTotal = 0, dSumatoriaTotal = 0;
        int iContadorNotas1 = 0, iContadorMayor = 0, iContadorMenor = 0, iTotalNotas = 20;
        Boolean bError = false;
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa notas de los estudiantes (Rango: 1-7)");
        for (int i = 0; i < iTotalNotas; i ++)
        {

            System.out.println("Ingresa la nota "+ (i + 1) +": ");
            try
            {
                dNota = sn.nextDouble();
            }
            catch (Exception e)
            {
                System.out.println("Error: nota no valida!");
                bError = true;
                break;
            }
            if(dNota <= 0 || dNota > 7)
            {
                System.out.println("Error: nota fuera del rango valido!");
                bError = true;
                break;
            }
            else
            {
                dSumatoriaTotal += dNota;
                if (dNota > 5)
                {
                    dPromedioMayores += dNota;
                    iContadorMayor++;
                }
                if (dNota < 4)
                {
                    dPromomedioMenores += dNota;
                    iContadorMenor++;
                }
                if (dNota == 1)
                    iContadorNotas1++;
            }
        }
        if(!bError)
        {
            System.out.println("El promedio total es: " + (dSumatoriaTotal/iTotalNotas) );
            System.out.println("El promedio de las notas mayores a 5 es: " + (dPromedioMayores/iContadorMayor) );
            System.out.println("El promedio de las notas menores a 4 es: " + (dPromomedioMenores/iContadorMenor) );
            System.out.println("El total de notas 1 es:" + iContadorNotas1);
        }
    }
}
