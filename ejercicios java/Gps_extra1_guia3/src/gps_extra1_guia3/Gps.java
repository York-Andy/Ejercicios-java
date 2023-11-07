package gps_extra1_guia3;

/*Como vemos en el modelo, una Persona usa un GPS y el GPS tiene una Posición. Con respecto a
la clase GPS la lógica de sus métodos especiales es la siguiente:
- mover() Este método generará una nueva Posición con valores aleatorios para la latitud
y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable
atributo “ultimaUbicacion”
- obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo
“ultimaUbicacion”*/
public class Gps {

    private String marca;
    private String modelo;
    //private Object untitledField;
    private Posicion ultimaUbicacion;

    public Gps(String marca,String modelo) {
        this.marca=marca;
        this.modelo=modelo;
        this.ultimaUbicacion=new Posicion(Math.random()*1,Math.random()*1);
    }

    public Gps() {
        
    }

   public void mover() {
  ultimaUbicacion.setLongitud(Math.random()*1);
  ultimaUbicacion.setLatitud(Math.random()*1);
        
    }
    public Posicion obtenerUltimaPosicion() {
        // System.out.println("La longitud es: "+ultimaUbicacion.getLongitud());
        // System.out.println("La latitud es: "+ultimaUbicacion.getLatitud());
         return ultimaUbicacion;
    }
}
