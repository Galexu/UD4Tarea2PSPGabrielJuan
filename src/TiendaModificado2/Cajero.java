package TiendaModificado2;

import java.util.Random;

public class Cajero extends Thread{
    private Tienda tienda;

    public Cajero(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public void run() {
        Random random = new Random();
        int numTransacciones = random.nextInt(3) + 3;

        for (int i = 0; i < numTransacciones; i++) {
            int monto = random.nextInt(100) + 1;
            tienda.agregarVenta(monto);
        }
    }
}
