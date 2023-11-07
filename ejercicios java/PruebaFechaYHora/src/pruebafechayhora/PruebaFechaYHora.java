/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafechayhora;


import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;




/**
 *
 * @author Pablo
 */
public class PruebaFechaYHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //REPRESENTAR LA FECHA ACTUAL
        /*
        LocalDate actual = LocalDate.now();
         System.out.println(actual);
        */
        
        //REPRESENTAR LA FECHA 20 DE ABRIL DEL 2023
        /*
        // Primero anio, despues de Month. ponemos el mes y luego el dia
        LocalDate fecha1 = LocalDate.of(2023, Month.APRIL, 20);
         System.out.println(fecha1); 
        */
        
        //REPRESENTAR UNA FECHA PROVENIENTE DE UN STRING
        /*
         String cadena = "2023-04-20";
         LocalDate fecha2 = LocalDate.parse(cadena);
         System.out.println(fecha2); 
        */
        
        //REPRESENTAR UNA FECHA CON OTRO FORMATO LOCAL
        /*
        String cadena2 = "20/04/2023";
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha3 = LocalDate.parse(cadena2,forma);
        System.out.println(fecha3); 
         */
        
       //DADA DOS FECHAS CALCULAR EL TIEMPO ENTRE ELLAS
       /*
       // Dentro del ChronoUnit pongo . "DAYS" pero se pude poner mes o anio y calcular en base a eso
       // El resultado se guarda en un long
       /*LocalDate desde =  LocalDate.now();
       LocalDate hasta = LocalDate.of(2023, Month.APRIL, 20);
       long dias = ChronoUnit.DAYS.between(hasta, desde);
        System.out.println(dias); 
       */
       
        //DADA UNA FECHA OBTENER EL DIA DE LA SEMANA Y MOSTRAR(CONVERTIR A ESPANIOL)
        
        // Generamos la fecha actual
        LocalDate hoy = LocalDate.now();
        
        //"hoy. getDayOfWeek" me devuelve un enum con el dia de la semana
        DayOfWeek diaNombre = hoy. getDayOfWeek();
        
        //Con "Locale" le paso el codigo del idioma y del pais
        Locale pais = new Locale("ES","AR");
        
        //Habiendo generado ese Local ahora puedo usar el metodo "getDisplayName"
        //ahora puedo del enun dayOfWeek "diaNombre" invocar el metodo "getDisplayName"
        // El metodo "getDisplayName" viene con dos parametros. El primero "TextStyle" muesta
        // el modo en que viene (FULL = se ve entero) y el segundo parametro el idioma
        System.out.println(diaNombre.getDisplayName(TextStyle.FULL, pais));
        
        
        //DADO UN DIA DE LA SEMANA INGREMENTAR EN UNO
        
        // Con ek DayOfWeek referenciado con diaNombre uso el metodo ".plus"
        // que dado un dia de la semana lo incremente en x
        DayOfWeek diaPosterior = diaNombre.plus(1);
        System.out.println(diaPosterior.getDisplayName(TextStyle.FULL, pais));
        
        //DADO UNA FECHA OBTENER MES Y MOSTRAR
        
        //Tanto Month como DayOfWeek son enum, que funconaria como clase o objeto pero no lo son
        // por eso primero el tipo de dato "Month" o el tipo de dato "DayOfWeek"
        Month mes = hoy.getMonth();
        
        System.out.println(mes);
        
        //Si lo quiero en espaniol lo hago gracias al metodo Locale y invoco al metodo getDisplayName 
        System.out.println(mes.getDisplayName(TextStyle.FULL, pais));//
    }
    
}
