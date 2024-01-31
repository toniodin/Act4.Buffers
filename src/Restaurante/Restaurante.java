package Restaurante;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurante {
    private Queue<String> colaPedidos = new LinkedList<>();

    public synchronized void realizarPedido(String pedido) throws InterruptedException {
        while (colaPedidos.size() >= 10) {
            wait();  
        }
        colaPedidos.add(pedido);
        System.out.println("Camarero: Pedido " + pedido + " tomado.");
        notify(); 
    }

    public synchronized void prepararPedido() throws InterruptedException {
        while (colaPedidos.isEmpty()) {
            wait(); 
        }
        String pedido = colaPedidos.poll();
        System.out.println("Cocinero: Preparando pedido " + pedido);
        Thread.sleep(2000); 
        System.out.println("Cocinero: Pedido " + pedido + " listo para servir.");
        notify();  
    }
}