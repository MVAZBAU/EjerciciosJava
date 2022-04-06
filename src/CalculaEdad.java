import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculaEdad {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edad = 0;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(" Ingresa tu fecha de nacimiento con formato [ yyyy-mm-dd ]: ");
        try{
            Date fechaIngresada = formato.parse(s.next());
            Date fechaActual = new Date();

            edad =   ((Integer) fechaActual.getYear()) - ((Integer) fechaIngresada.getYear());
            System.out.println("¡ Actualmente tienes "+edad+" anios!");
        }catch (ParseException exception){
            exception.printStackTrace();
        }
    }
}
