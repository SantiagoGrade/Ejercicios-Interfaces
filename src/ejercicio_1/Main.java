package ejercicio_1;

public class Main {
    public static void main(String[] args) {
        ReproductorSoloMusica reproductor1 = new ReproductorSoloMusica("Snaptube");
        Celular celular1 = new Celular("Samsung");

        System.out.println(reproductor1.detener());
        System.out.println(reproductor1.parar());
        System.out.println(reproductor1.reproducir());

        System.out.println(celular1.detener());
        System.out.println(celular1.parar());
        System.out.println(celular1.reproducir());


    }
}