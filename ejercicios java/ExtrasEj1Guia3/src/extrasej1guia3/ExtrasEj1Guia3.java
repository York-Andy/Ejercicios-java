/*
Dado el siguiente modelo, impleméntelo en Java.

Como vemos en el modelo, una Persona usa un GPS y el GPS tiene una Posición. Con respecto a
la clase GPS la lógica de sus métodos especiales es la siguiente:
- mover() Este método generará una nueva Posición con valores aleatorios para la latitud
y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable
atributo “ultimaUbicacion”
- obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo
“ultimaUbicacion”

En la clase Persona, el método ubicarme() es el que usa el GPS para solicitar que se mueva y
luego le pide la última posición que luego mostrará por pantalla.
 */
package extrasej1guia3;


public class ExtrasEj1Guia3 {


    public static void main(String[] args) {
        // TODO code application logic here
        GPS gps = new GPS("Rolex", "2018");
        Persona persona1 = new Persona ("Gutierrez", "Jose");
        persona1.ubicarme(gps);
        persona1.ubicarme(gps);
    }
    
}
