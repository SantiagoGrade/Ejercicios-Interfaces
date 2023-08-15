package ejercicio_2;

public class Libro implements Vendible, Mostrable{
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public String mostrarInformacion() {
        return "Título: " + titulo + " - Autor: " + autor + " - Precio: $" + precio;
    }

    public double obtenerPrecio() {
        return precio;
    }
}
