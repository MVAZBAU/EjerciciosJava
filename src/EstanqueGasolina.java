/**
 ** Nombre:             EstanqueGasolina
 ** Propósito:          Obtener el estado de un tanque de gasolina
 ** Descripción:        Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida
 *                      la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 *                      La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero
 *                      tambien puede ser del tipo int.
 *                          - Si la capacidad actual es 70 litros: imprimir Estanque lleno
 *                          - Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 *                          - Si está entre 40 y menor a 60: imprimir Estanque  3/4
 *                          - Si está entre 35 y menor a 40: imprimir Medio Estanque
 *                          - Si está entre 20 y menor a 35: imprimir Suficiente
 *                          - Si está entre 1 y menor a 20: imprimir Insuficiente
 ** Retorna:
 **
 ** Fecha creación:     30/01/2022
 ** Autor o creador:    MVAZBAU
 **
 ** Fecha modificación:
 ** Autor modificación:
 ** Revisión:
 **/
import java.util.Scanner;

public class EstanqueGasolina
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese estado del tanque actual: ");
        double medidaActual = s.nextDouble();
        String  estadoTanque =
            (medidaActual == 70) ? "Estanque lleno":
            (medidaActual >= 60 && medidaActual < 70)? "Estanque casi lleno"    :
            (medidaActual >= 40 && medidaActual < 60)? "Estanque  3/4"          :
            (medidaActual >= 35 && medidaActual < 40)? "Medio Estanque "        :
            (medidaActual >= 20 && medidaActual < 35)? "Suficiente "            :
            (medidaActual >= 1 && medidaActual < 20)?  "Insuficiente "          :
            "Valor no valido, debe ser un número entre 1 y 70";
        System.out.println(estadoTanque);
    }
}
