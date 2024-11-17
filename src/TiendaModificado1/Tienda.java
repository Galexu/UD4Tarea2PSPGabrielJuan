package TiendaModificado1;

public class Tienda {
    private int totalVentas = 0;

    public synchronized void agregarVenta(int venta) {
        totalVentas += venta;
    }

    public synchronized void aplicarDescuento(int descuento) {
        totalVentas -= descuento;
    }

    public int getTotalVentas() {
        return totalVentas;
    }
}
