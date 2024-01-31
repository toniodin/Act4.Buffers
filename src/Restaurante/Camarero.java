package Restaurante;

public class Camarero implements Runnable {
    private Restaurante restaurante;

    public Camarero(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String pedido = "Pedido " + Math.round(Math.random() * 20);
                restaurante.realizarPedido(pedido);
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
