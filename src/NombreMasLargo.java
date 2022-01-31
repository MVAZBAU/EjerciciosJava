/**
 ** Nombre:             NombreMasLargo
 ** Propósito:          Obtener el nombre mas largo de tres personas
 ** Descripción:        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
 *                      o amigos usando la clase JOptionPane y método showInputDialog().Calcular e Imprimir el nombre de
 *                      la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir sólo uno de los
 *                      tres, el de más caracteres en el nombre.)
 *                      Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con
 *                      el indice cero accedemos al nombre de la persona.
 *
 *                      Restricción no usar loops.
 ** Retorna:
 **
 ** Fecha creación:     30/01/2022
 ** Autor o creador:	MVAZBAU
 **
 ** Fecha modificación:
 ** Autor modificación:
 ** Revisión:
 **/
import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class NombreMasLargo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int iTotalNombres = 3;
        String strNombres[][]     = new String[iTotalNombres][],
               strNombreCompleto ="",
               strResultado     = "";
        strNombreCompleto = JOptionPane.showInputDialog("Ingrese un nombre y un apellido:");
        strNombres[0] = strNombreCompleto.split(" ");
        strNombreCompleto = JOptionPane.showInputDialog("Ingrese un nombre y un apellido: ");
        strNombres[1] = strNombreCompleto.split(" ");
        strNombreCompleto = JOptionPane.showInputDialog("Ingrese un nombre y un apellido: ");
        strNombres[2] = strNombreCompleto.split(" ");
        strResultado =
                (strNombres[0][0].length() > strNombres[1][0].length()) ? strNombres[0][0] + " " + strNombres[0][1] + " tiene el nombre más largo.":
                (strNombres[1][0].length() > strNombres[2][0].length()) ? strNombres[1][0] + " " + strNombres[1][1] + " tiene el nombre más largo.":
                (strNombres[2][0].length() > strNombres[0][0].length()) ? strNombres[2][0] + " " + strNombres[2][1] + " tiene el nombre más largo.":
                "Los nombres tienen la misma longitud.";
        System.out.println(strResultado);
    }
}
