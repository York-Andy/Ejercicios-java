package gps_extra1_guia3;

/*En la clase Persona, el método ubicarme() es el que usa el GPS para solicitar que se mueva y
luego le pide la última posición que luego mostrará por pantalla.*/

public class Persona {
    private Gps x;
    private String apellido;
    private String nombre;

    public Persona(String apellido, String nombre) {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void ubicarme(Gps gps) {
        gps.mover();
        
    }
}
