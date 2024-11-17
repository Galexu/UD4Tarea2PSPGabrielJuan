package Tienda;

public class Tienda {
    private int totalVentas = 0;

    public synchronized void agregarVenta(int venta) {
        totalVentas += venta;
    }

    public int getTotalVentas() {
        return totalVentas;
    }
}
