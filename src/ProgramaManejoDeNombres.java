import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int iTotalNombres = 3, iLongitud = 0;
        String strNombres[] = new String[iTotalNombres],strCadena="";
        char[] cCadena;
        for (int i = 0 ; i < iTotalNombres ; i++)
        {
            System.out.println("Ingresa el nombre no. " + (i+1)+":");
            strNombres[i] = scanner.nextLine();
            iLongitud = strNombres[i].length();
            strCadena += strNombres[i].toUpperCase(Locale.ROOT).charAt(1) + "." +  strNombres[i].substring(iLongitud-2);
            if(i < iTotalNombres-1)
                strCadena += "_";
        }
        System.out.println("Nombres concatenados = " + strCadena);
    }
}
