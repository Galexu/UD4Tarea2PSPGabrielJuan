package TiendaModificado2;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private int totalVentas = 0;
    private int totalTransacciones = 0;
    private List<Integer> ultimosTresRegistros = new ArrayList<>();

    public synchronized void agregarVenta(int venta) {
        totalTransacciones++;
        totalVentas += venta;

        if (ultimosTresRegistros.size() >= 3) {
            ultimosTresRegistros.remove(2);
            ultimosTresRegistros.add(venta);
        } else {
            ultimosTresRegistros.add(venta);
        }
    }

    public synchronized void aplicarDescuento(int descuento) {
        totalVentas -= descuento;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public int getTotalTransacciones() {
        return totalTransacciones;
    }

    public List<Integer> getUltimosTresRegistros() {
        return ultimosTresRegistros;
    }
}
