/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps_extra1_guia3;



/**
 *
 * @author familia maida
 */
public class Gps_extra1_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posicion ultimaPosicion=new Posicion(0, 1);
        Gps gps=new Gps("Garmin","Xp500");
        gps.mover();
        System.out.println(gps.obtenerUltimaPosicion().getLatitud()) ;
        System.out.println(gps.obtenerUltimaPosicion().getLongitud()) ;
    }
    
}
