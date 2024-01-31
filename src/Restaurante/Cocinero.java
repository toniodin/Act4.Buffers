package Restaurante;

public class Cocinero implements Runnable {
    private Restaurante restaurante;

    public Cocinero(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        while (true) {
            try {
                restaurante.prepararPedido();
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}