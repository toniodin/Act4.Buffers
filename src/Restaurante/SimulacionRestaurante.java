package Restaurante;

public class SimulacionRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Thread camareroThread = new Thread(new Camarero(restaurante));
        Thread cocineroThread = new Thread(new Cocinero(restaurante));

        camareroThread.start();
        cocineroThread.start();
    }
}
