package TiendaModificado1;

import java.util.Random;

public class Administrador extends Thread{
    private Tienda tienda;

    public Administrador(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public void run() {
        Random random = new Random();
        int descuento = random.nextInt(100) + 1;
        System.out.println("Descuent a aplicar por el administrador: " + descuento);
        tienda.aplicarDescuento(descuento);
    }
}
