package ejercicio_2;

public class Main {
    public static void main(String[] args){
        Libro libro1 = new Libro("Scorpion City", "Mario Mendoza", 15000.99);
        Libro libro2 = new Libro("La biblia", "Jesus", 12000.49);

        System.out.println(libro1.mostrarInformacion()+"\n");
        System.out.println(libro1.obtenerPrecio()+"\n");

        System.out.println(libro2.mostrarInformacion()+"\n");
        System.out.println(libro2.obtenerPrecio()+"\n");

    }



}
