package ejercicio_1;

public class Celular {
    private String nombre;

    public Celular(String nombre){
        this.nombre = nombre;
    }

    public String detener() {

        return "El reproductor: "+ nombre +" Se ha detenido";
    }

    public String parar() {

        return "El reproductor: "+ nombre +" pauso la musica";
    }
    public String reproducir() {

        return "El reproductor: "+ nombre +" Se ha empezado a reproducir musica";
    }
}
